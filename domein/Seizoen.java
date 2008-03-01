package domein;
public class Seizoen {
	private int seizoenID;
	private String seizoen;
	
	
	
	public Seizoen(int seizoenID, String seizoen) {
		setSeizoenID(seizoenID);
		setSeizoen(seizoen);
	}
	public String getSeizoen() {
		return seizoen;
	}
	public void setSeizoen(String seizoen) {
		this.seizoen = seizoen;
	}
	public int getSeizoenID() {
		return seizoenID;
	}
	public void setSeizoenID(int seizoenID) {
		this.seizoenID = seizoenID;
	}
	
}
