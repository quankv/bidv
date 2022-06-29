package soa.common;

import java.io.StringReader;
import java.io.StringWriter;

import javax.jms.BytesMessage;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.TemporaryQueue;
import javax.jms.TextMessage;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import com.tibco.tibjms.TibjmsQueueConnectionFactory;


public class soaReqestReply {
	static QueueConnectionFactory soaconfact;
    static QueueConnection soacon;    
    static QueueSession soasession;
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		soaReqestReply.InitSOAConnection("tcp://10.53.19.15:7222", "admin", "");		
		try {
			//soaReqestReply.TestExchangeRateUpdate();		
		} catch (Exception e) {
			e.printStackTrace();
		}
		soaReqestReply.CloseSOAConnection();
		
	}
	
	
	public static SOARequestObject GenerateSOAMessage(Class<?> cls, Object soaobj)
	{
		SOARequestObject outputObj=new SOARequestObject();
		try
		{
			JAXBContext ctx = JAXBContext.newInstance(cls);
			Marshaller m = ctx.createMarshaller();
	        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	        StringWriter sw = new StringWriter();
	        m.marshal(soaobj, sw);
	        String message=sw.toString();	        
	        message=message.substring(message.indexOf(">")+1);	        	        
	        String envelopstart="<?xml version=\"1.0\" encoding=\"UTF-8\"?><SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\"><SOAP-ENV:Header/><SOAP-ENV:Body>";
	        String envelopend="</SOAP-ENV:Body></SOAP-ENV:Envelope>";
	        message=envelopstart+message+envelopend;
	        outputObj.setErrcode(0);
	        outputObj.setResponsemsg(message);
		}
		catch(Exception e)
		{
			//BIDVLog.writeLog(BIDVAPIConfig.LOGFILE, BIDVLog.StackTraceToString(e));
			outputObj.setErrcode(1);
			outputObj.setResponsemsg("");
			e.printStackTrace();
			
		}
		return outputObj;
	}
	public static SOAResponeObject GenerateSOAResponseObject(Class<?> cls, String soaresponsemsg)
	{
		SOAResponeObject outputObj=new SOAResponeObject();
		try
		{
			JAXBContext ctx = JAXBContext.newInstance(cls);		
			Unmarshaller unmarshaller = ctx.createUnmarshaller();
			XMLStreamReader reader = XMLInputFactory.newInstance().createXMLStreamReader(new StringReader(soaresponsemsg));
			Object res=unmarshaller.unmarshal(reader);
			outputObj.setSoaResponseObj(res);			
			outputObj.setErrcode(0);
			outputObj.setResponsemsg(soaresponsemsg);
		}
		catch(Exception e)
		{
			//BIDVLog.writeLog(BIDVAPIConfig.LOGFILE, BIDVLog.StackTraceToString(e));
			outputObj.setSoaResponseObj(null);
			outputObj.setErrcode(6);
			outputObj.setResponsemsg(soaresponsemsg);
		}
		return outputObj;
	}
	public static int InitSOAConnection(String url,String username, String password)
	{
		int errcode=0;
		try
		{
			soaconfact=new TibjmsQueueConnectionFactory(url);		
			soacon=soaconfact.createQueueConnection(username, password);
			soacon.start();
			soasession=soacon.createQueueSession(false,javax.jms.Session.AUTO_ACKNOWLEDGE);
			System.out.println("Connect SOA Success");
		}
		catch(JMSException jmsexception)
		{
			errcode=1;
			//BIDVLog.writeLog(BIDVAPIConfig.LOGFILE, BIDVLog.StackTraceToString(jmsexception));
		}
		catch (Exception e) {
			// TODO: handle exception
			errcode=2;
			//BIDVLog.writeLog(BIDVAPIConfig.LOGFILE, BIDVLog.StackTraceToString(e));
		}
		return errcode;
	}
	public static int CloseSOAConnection()
	{
		int errcode=0;
		try
		{
			soasession.close();
	        soacon.stop();
	        soacon.close();	  
		}
		catch(JMSException jmsexception)
		{
			errcode=1;
			//BIDVLog.writeLog(BIDVAPIConfig.LOGFILE, BIDVLog.StackTraceToString(jmsexception));
		}
		catch (Exception e) {
			// TODO: handle exception
			errcode=2;
			//BIDVLog.writeLog(BIDVAPIConfig.LOGFILE, BIDVLog.StackTraceToString(e));
		}
		return errcode;
	}
	public static SOAResponeObject ProcessSOAService(String queue, String soapAction, String soamessage, int milisecTimeOut)
	{
		SOAResponeObject outputObj=new SOAResponeObject();
		try
		{
			Queue soaqueue=soasession.createQueue(queue);	        
	
			QueueSender sender = soasession.createSender(soaqueue);

	        TemporaryQueue replyQ = soasession.createTemporaryQueue();
	        MessageConsumer replyConsumer = soasession.createConsumer(replyQ);
	
	        TextMessage emstxtmessage = soasession.createTextMessage();
	        emstxtmessage.setJMSReplyTo(replyQ);
	        emstxtmessage.setText(soamessage);
	        emstxtmessage.setStringProperty("Mime_Version", "1.0");
	        emstxtmessage.setStringProperty("SoapAction", soapAction);
	        emstxtmessage.setStringProperty("Content_Type", "text/xml; charset=\"utf-8\"");	  
	        
	        //System.out.println("req=" + soamessage);
	        
	        sender.send(emstxtmessage);
	        String responsemsg="";
	        try
	        {
	        	Object replyByteMsg = replyConsumer.receive(milisecTimeOut);
	        	String replyMsg = "";
	        	if(replyByteMsg instanceof BytesMessage) {
	        		BytesMessage byteMessage = (BytesMessage) replyByteMsg;
	        		byte[] data = new byte[(int)byteMessage.getBodyLength()];
	        		byteMessage.readBytes(data);
		        	replyMsg = new String(data);
	        	} else {
	        		TextMessage replyTextMsg = (TextMessage) replyByteMsg;
	        		replyMsg = replyTextMsg.getText();
	        	}	        
	        	if(replyMsg!=null)
	        	{
	        		responsemsg=replyMsg;
	        		
	        		responsemsg=responsemsg.substring(responsemsg.indexOf("<SOAP-ENV:Body>"),responsemsg.indexOf("</SOAP-ENV:Body>"));
	        		
	        		//System.out.println("res=" + responsemsg);
	        		
	        		responsemsg=responsemsg.substring(responsemsg.indexOf(">")+1);
	        		outputObj.setErrcode(0);
	        		outputObj.setResponsemsg(responsemsg);
	        		
	        	}
	        	else
	        	{
	        		outputObj.setErrcode(5);
	        		outputObj.setResponsemsg("");
	        		outputObj.setErrdesc("Timeout");
	        	}
	        }
	        catch(JMSException jmsexception)
	        {
	        	outputObj.setErrcode(4);
        		outputObj.setResponsemsg("");
        		outputObj.setErrdesc(StackTraceToString(jmsexception));
        		//BIDVLog.writeLog(BIDVAPIConfig.LOGFILE, BIDVLog.StackTraceToString(jmsexception));
	        }
	        replyConsumer.close();
	        replyQ.delete();
	        sender.close();
		}
		catch(JMSException jmsexception)
		{
			outputObj.setErrcode(2);
    		outputObj.setResponsemsg("");
    		outputObj.setErrdesc(StackTraceToString(jmsexception));
    		//BIDVLog.writeLog(BIDVAPIConfig.LOGFILE, BIDVLog.StackTraceToString(jmsexception));
		}
		catch(Exception e)
		{
			outputObj.setErrcode(3);
    		outputObj.setResponsemsg("");
    		outputObj.setErrdesc(StackTraceToString(e));
    		//BIDVLog.writeLog(BIDVAPIConfig.LOGFILE, BIDVLog.StackTraceToString(e));
		}
		return outputObj;
	}
	
	public static String StackTraceToString(Exception ex) {
        String result = ex.toString() + "\n";
        StackTraceElement[] trace = ex.getStackTrace();
        for (int i=0;i<trace.length;i++) {
            result += trace[i].toString() + "\n";
        }
        return result;
    }
	
}
