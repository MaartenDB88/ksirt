package domein;
public class Data {
	private int datanummer;
	private String van;
	private String tot;
	private int SeizoenID;
	

	
	
	public Data(int datanummer, String van, String tot, int seizoenID) {
		setDatanummer(datanummer);
		setVan(van);
		setTot(tot);
		setSeizoenID(seizoenID);
	}


	public void setDatanummer(int data){
		datanummer=data;
	}
	
	
	public void setVan(String van){
		this.van=van;
	}
	
	public void setTot(String tot){
		this.tot=tot;
	}
	
	public void setSeizoenID(int ID){
		SeizoenID=ID;
	}

	public int getSeizoenID() {
		return SeizoenID;
	}

	public int getDatanummer() {
		return datanummer;
	}

	public String getTot() {
		return tot;
	}

	public String getVan() {
		return van;
	}
}
