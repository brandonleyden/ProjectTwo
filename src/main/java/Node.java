import java.io.Serializable;

public class Node implements Serializable{

	private static final long serialVersionUID = 1L;
	private String ipAddress;
	private int port;
	private int id;

	
	public Node(int id, String ipAddress,int port) {
		this.id = id;
		this.ipAddress = ipAddress;
		this.port = port;
	}


	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getPort() {
		return port;
	}


	//Checks object going into equals against multiple conditions
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (id != other.id)
			return false;
		if (ipAddress == null) {
			if (other.ipAddress != null)
				return false;
		} else if (!ipAddress.equals(other.ipAddress))
			return false;
		if (port != other.port)
			return false;
		return true;
	}

	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((ipAddress == null) ? 0 : ipAddress.hashCode());
		result = prime * result + port;
		return result;
	} */



	
}
