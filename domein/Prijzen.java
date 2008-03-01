package domein;
public class Prijzen {
	
	private int prijsID;
	private String kamertype;
	private String seizoen;
	private int prijs;
	
	
	
	public Prijzen(int prijsID, String kamertype, String seizoen, int prijs) {
		setPrijsID(prijsID);
		setKamertype(kamertype);
		setSeizoen(seizoen);
		setPrijs(prijs);
	}
	public String getKamertype() {
		return kamertype;
	}
	public void setKamertype(String kamertype) {
		this.kamertype = kamertype;
	}
	public int getPrijs() {
		return prijs;
	}
	public void setPrijs(int prijs) {
		this.prijs = prijs;
	}
	public int getPrijsID() {
		return prijsID;
	}
	public void setPrijsID(int prijsID) {
		this.prijsID = prijsID;
	}
	public String getSeizoen() {
		return seizoen;
	}
	public void setSeizoen(String seizoen) {
		this.seizoen = seizoen;
	}
	
	
}
