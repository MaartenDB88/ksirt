package domein;

import java.util.List;

public class DomeinController {
	
	private Hotel hotel;
	private Klant huidigKlant;
	private Boeking huidigReservatie;
	private Kamer huidigKamer;
	
	
	public DomeinController()
	{
		hotel = new Hotel();
	}
	
	public void huidigKlant(int index)
	{
		huidigKlant = hotel.geefKlanten(index);
	}
	
	
	public String geefNaam() 
	{
		return (huidigKlant == null)? null: huidigKlant.getNaam();
	}
	
	public String geefVoornaam() 
	{
		return (huidigKlant == null)? null: huidigKlant.getVoornaam();
	}	
	
	public String geefAanspreking() 
	{
		return (huidigKlant == null)? null: huidigKlant.getAanspreking();
	}	
	
	//TODO rest van klanten attributen?
	
	public void wijzigKlant()
	{
		
	}
	
	
	
	
	public void huidigReservatie(int index)
	{
		huidigReservatie = hotel.geefBoekingen(index);
	}
	
	public int geefKlant() 
	{
		return (huidigReservatie == null)? null: huidigReservatie.getKlant();
	}
	
	public int geefKamer() 
	{
		return (huidigReservatie == null)? null: huidigReservatie.getKamer();
	}
	
	public String geefAankomst() 
	{
		return (huidigReservatie == null)? null: huidigReservatie.getAankomst();
	}
	
	public String geefVertrek() 
	{
		return (huidigReservatie == null)? null: huidigReservatie.getVertrek();
	}
	
	public boolean geefVerzekering() 
	{
		return (huidigReservatie == null)? null: huidigReservatie.getVerzekering();
	}
	
	public String geefSeizoen() 
	{
		return (huidigReservatie == null)? null: huidigReservatie.getSeizoen();
	}
	
	public int geefFactuur() 
	{
		return (huidigReservatie == null)? null: huidigReservatie.getFactuur();
	}
	
	public String geefFactuurdatum() 
	{
		return (huidigReservatie == null)? null: huidigReservatie.getFactuurdatum();
	}
	
	public int geefCreditnota() 
	{
		return (huidigReservatie == null)? null: huidigReservatie.getCreditnota();
	}
	
	public String geefCreditdatum() 
	{
		return (huidigReservatie == null)? null: huidigReservatie.getCreditdatum();
	}
	
	
	
	
	
	
	
	
	
	
	
	public void huidigKamer(int index)
	{
		huidigKamer = hotel.geefKamers(index);
	}
	
}
