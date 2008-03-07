package domein;
public class Catering {
	private int cateringnr;
	private int prijs;
	private String type;
	
	
	
	public Catering(int cateringnr, int prijs, String type) {
		
		setCateringnr(cateringnr);
		setPrijs(prijs);
		setType(type);
	}
	
	public int getCateringnr() {
		return cateringnr;
	}
	public void setCateringnr(int cateringnr) {
		this.cateringnr = cateringnr;
	}
	public int getPrijs() {
		return prijs;
	}
	public void setPrijs(int prijs) {
		this.prijs = prijs;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
