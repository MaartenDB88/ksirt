package domein;
public class Kamer {
	private int kamernummer;
	private String kamertype;
	
	
	public Kamer(String type,int nummer){
		setKamertype(type);
		setKamernummer(nummer);
	}
	
	public String getKamertype() {
		return kamertype;
	}
	public void setKamertype(String kamertype) {
		this.kamertype=kamertype;
	}
	
	public int getKamernummer(){
		return kamernummer;
	}
	
	public void setKamernummer(int kamernummer){
		this.kamernummer=kamernummer;
	}
}
