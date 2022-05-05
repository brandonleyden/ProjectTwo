import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Message implements Serializable{

	//Main class for sharing the routing table, communicating any updates from node to node
	private List<String> routingTable= new ArrayList<String>();
	private static final long serialVersionUID = 1L;
	private String ipAddress;
	private String type;
	private int port;
	private int id;


	public Message(){}

	public Message(int id, String ipAddress, int port,String type) {
		super();
		this.id = id;
		this.ipAddress = ipAddress;
		this.port = port;
		this.type = type;
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

	public void setRoutingTable(List<String> routingTable) {
		this.routingTable = routingTable;
	}

	public List<String> getRoutingTable() {
		return routingTable;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}


	
	
}
