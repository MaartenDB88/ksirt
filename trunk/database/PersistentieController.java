package persistentie;

import java.sql.Connection;
import java.util.List;

import domein.Klant;

public class PersistentieController {
	  
//	PersistentieController is een singleton (= bevat geen public
//		constructor)
		
		
		/**
		 * @directed true
		 */
		
		private static PersistentieController persistentieController;
		
		/**
		 * @directed true
		 */
		
		private KlantMapper klantMapper;
		  
		/**
		 * @directed true
		 */
		
		private Connectie connectie;
		  
		  public static PersistentieController getInstance()
		  {	
				if (persistentieController == null)
					persistentieController = new PersistentieController();
				return persistentieController;
		  }
		  
		  private PersistentieController()
		  {
			  connectie = new Connectie();
			  klantMapper = new KlantMapper();
		  } 
		  
		  public List<Klant> geefKlanten() 
		  {
			  return klantMapper.geefKlanten();
		  }
		  
		  //public void wijzigKlant(Klant klant) {
			  //klantMapper.wijzigKlant(klant);
		  //}
		  
		  public Connection getConnection()
		  {
			  return connectie.getConnection();
		  }
		  
		  public void closeConnection()
		  {
			  connectie.closeConnection();
		  }
		  
}
