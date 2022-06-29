package bidv.esb.signature.bean;

public class FileHash {
	private String type;
	private String name;
	private String hash;

	/**
	 * @param type
	 * @param name
	 * @param hash
	 */
	public FileHash(String type, String name, String hash) {
		super();
		this.type = type;
		this.name = name;
		this.hash = hash;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

}
