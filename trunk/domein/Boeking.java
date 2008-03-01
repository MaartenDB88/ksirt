package domein;
public class Boeking {
	private int boekingnummer;
	private String boekingsdatum;
	private int klant; 
	private int kamer;
	private String aankomst;
	private String vertrek;
	private int aantalpersonen;
	private boolean verzekering;
	private String seizoen;
	private int factuur;
	private String factuurdatum;
	private int creditnota;
	private String creditdatum;
	
	
	
	
	public Boeking(int boekingnummer, String boekingsdatum, int klant, int kamer, String aankomst, String vertrek, int aantalpersonen, boolean verzekering, String seizoen, int factuur, String factuurdatum, int creditnota, String creditdatum) {
		super();
		setBoekingnummer(boekingnummer);
		setBoekingsdatum(boekingsdatum);
		setKlant(klant);
		setKamer(kamer);
		setAankomst(aankomst);
		setVertrek(vertrek);
		setAantalpersonen(aantalpersonen);
		setVerzekering(verzekering);
		setSeizoen(seizoen);
		setFactuur(factuur);
		setFactuurdatum(factuurdatum);
		setCreditnota(creditnota);
		setCreditdatum(creditdatum);
	}
	
	public String getAankomst() {
		return aankomst;
	}
	public void setAankomst(String aankomst) {
		this.aankomst = aankomst;
	}
	public int getAantalpersonen() {
		return aantalpersonen;
	}
	public void setAantalpersonen(int aantalpersonen) {
		this.aantalpersonen = aantalpersonen;
	}
	public int getBoekingnummer() {
		return boekingnummer;
	}
	public void setBoekingnummer(int boekingnummer) {
		this.boekingnummer = boekingnummer;
	}
	public String getBoekingsdatum() {
		return boekingsdatum;
	}
	public void setBoekingsdatum(String boekingsdatum) {
		this.boekingsdatum = boekingsdatum;
	}
	public String getCreditdatum() {
		return creditdatum;
	}
	public void setCreditdatum(String creditdatum) {
		this.creditdatum = creditdatum;
	}
	public int getCreditnota() {
		return creditnota;
	}
	public void setCreditnota(int creditnota) {
		this.creditnota = creditnota;
	}
	public int getFactuur() {
		return factuur;
	}
	public void setFactuur(int factuur) {
		this.factuur = factuur;
	}
	public String getFactuurdatum() {
		return factuurdatum;
	}
	public void setFactuurdatum(String factuurdatum) {
		this.factuurdatum = factuurdatum;
	}
	public int getKamer() {
		return kamer;
	}
	public void setKamer(int kamer) {
		this.kamer = kamer;
	}
	public int getKlant() {
		return klant;
	}
	public void setKlant(int klant) {
		this.klant = klant;
	}
	public String getSeizoen() {
		return seizoen;
	}
	public void setSeizoen(String seizoen) {
		this.seizoen = seizoen;
	}
	public String getVertrek() {
		return vertrek;
	}
	public void setVertrek(String vertrek) {
		this.vertrek = vertrek;
	}
	public boolean getVerzekering() {
		return verzekering;
	}
	public void setVerzekering(boolean verzekering) {
		this.verzekering = verzekering;
	}

}
