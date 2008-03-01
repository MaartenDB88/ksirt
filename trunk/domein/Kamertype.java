package domein;
public class Kamertype {
	private int kamertypeID;
	private String type;
	
	
	public Kamertype(int kamertypeID, String type) {
		setKamertypeID(kamertypeID);
		setType(type);
	}
	public int getKamertypeID() {
		return kamertypeID;
	}
	public void setKamertypeID(int kamertypeID) {
		this.kamertypeID = kamertypeID;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
