package domein;

import java.util.List;
import java.util.ArrayList;

import persistentie.PersistentieController;

public class Hotel {
	
	private List<Kamer> kamers;
	private List<Klant> klanten;
	private List<Boeking> boekingen;
	
	public Hotel()
	{
		PersistentieController persistentieController = PersistentieController.getInstance();
	}
	
	public List<Boeking> getBoekingen() {
		return boekingen;
	}
	public List<Kamer> getKamers() {
		return kamers;
	}
	public List<Klant> getKlanten() {
		return klanten;
	}
	
	public Boeking geefBoekingen(int index)
	{
		return boekingen.get(index);
	}
	
	public Kamer geefKamers(int index)
	{
		return kamers.get(index);
		
	}
	
	public Klant geefKlanten(int index)
	{
		return klanten.get(index);
	}
	
}
