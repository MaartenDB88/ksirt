package domein;
public class Data {
	private int datanummer;
	private String van;
	private String tot;
	private int SeizoenID;
	
	public Data(int data,String van, String tot, int Seizoen){
		
	
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
}
