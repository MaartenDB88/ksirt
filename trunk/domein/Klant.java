package domein;
public class Klant
{
private String taalcode1;
//vars
private int klantnummer;
private String aanspreking;
private String naam;
private String voornaam;
private String bedrijf;
private String ondernemingsnummer;
private String straat;
private int huisnummer;
private String postcode;
private String stad;
private String land;
private String email;
private String telefoonnr;
private String fax;
private String gsm;
private String rekeningnummer;
private String iban;
private String bic;
private String taalcode;
private String notities;
	
	
	
	public Klant(int klantnummer, String aa, String vn, String fn, String be, String on, String st, int hnr, String stad, String po, String la, String te, String gs, String fa, String em, String re, String ib, String bi, String ta, String no)
		{
		setKlantnummer(klantnummer);
		setAanspreking(aa);
		setVoornaam(vn);
		setNaam(fn);
		setBedrijf(be);
		setOndernemingsnummer(on);
		setStraat(st);
		setHuisnummer(hnr);
		setStad(stad);
		setPostcode(po);
		setLand(la);
		setTelefoonnr(te);
		setGsm(gs);
		setFax(fa);
		setEmail(em);
		setRekeningnummer(re);
		setIban(ib);
		setBic(bi);
		setTaalcode(ta);
		setNotities(no);
		}
	

	public int getKlantnummer() {
		return klantnummer;
	}

	public void setKlantnummer(int klnr) {
		this.klantnummer = klnr;
	}
	public String getAanspreking() {
		return aanspreking;
	}

	public void setAanspreking(String aanspreking) {
		this.aanspreking = aanspreking;
	}

	public String getBedrijf() {
		return bedrijf;
	}


	public void setBedrijf(String bedrijf) {
		this.bedrijf = bedrijf;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getStad() {
		return stad;
	}

	public void setStad(String stad) {
		this.stad = stad;
	}

	public String getGsm() {
		return gsm;
	}

	public void setGsm(String gsm) {
		this.gsm = gsm;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	public String getNotities() {
		return notities;
	}

	public void setNotities(String notities) {
		this.notities = notities;
	}

	public int getHuisnummer() {
		return huisnummer;
	}

	public void setHuisnummer(int huisnummer) {
		this.huisnummer = huisnummer;
	}

	public String getOndernemingsnummer() {
		return ondernemingsnummer;
	}

	public void setOndernemingsnummer(String ondernemingsnummer) {
		this.ondernemingsnummer = ondernemingsnummer;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getRekeningnummer() {
		return rekeningnummer;
	}

	public void setRekeningnummer(String rekeningnummer) {
		this.rekeningnummer = rekeningnummer;
	}

	public String getStraat() {
		return straat;
	}

	public void setStraat(String straat) {
		this.straat = straat;
	}

	public String getTaalcode() {
		return taalcode;
	}

	public void setTaalcode(String taalcode) {
		this.taalcode = taalcode;
	}

	public String getTelefoonnr() {
		return telefoonnr;
	}

	public void setTelefoonnr(String telefoonnr) {
		this.telefoonnr = telefoonnr;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}


	public String getTaalcode1() {
		return taalcode1;
	}


	public void setTaalcode1(String taalcode1) {
		this.taalcode1 = taalcode1;
	}
	
	
}
