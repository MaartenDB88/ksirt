package persistentie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import domein.Klant;

public class KlantMapper {
	
	private final static String LEES_KLANTEN_SQL = "SELECT * from Klanten WHERE Klantnummer = 1";

	private final static String UPDATE_SQL = "UPDATE ";
	
	public List<Klant> geefKlanten() 
	{
		List<Klant> klantenLijst = new ArrayList<Klant>();

		// create Statement for querying database
		Statement statement;
		Connection connection = PersistentieController.getInstance().getConnection();
		try {
			statement = connection.createStatement();

			// query database
			ResultSet resultSet = statement.executeQuery(LEES_KLANTEN_SQL);

			while (resultSet.next()) {

				int klantnr = resultSet.getInt("Klantnummer");
				String aanspreking = resultSet.getString("Aanspreking");
				String naam = resultSet.getString("Naam");
				String voornaam = resultSet.getString("Voornaam");
				String bedrijf = resultSet.getString("Bedrijf");
				String ondnr = resultSet.getString("Ondernemingsnummer");
				String straat = resultSet.getString("Straat");
				String nummer = resultSet.getString("Nummer");
				String gemeente = resultSet.getString("Gemeente");
				String postcode = resultSet.getString("Postcode");
				String land = resultSet.getString("Land");
				String tel = resultSet.getString("Telefoon");
				String gsm = resultSet.getString("Gsm");
				String fax = resultSet.getString("Fax");
				String email = resultSet.getString("Email");
				String reknr = resultSet.getString("Rekeningnummer");
				String iban = resultSet.getString("Iban");
				String bic = resultSet.getString("Bic");
				String taalcode = resultSet.getString("Taalcode");
				String notities = resultSet.getString("Notities");
				
				Klant klant = new Klant(klantnr, aanspreking, naam, voornaam, bedrijf, ondnr, straat, nummer, gemeente, postcode, land, tel, gsm, fax, email, reknr, iban, bic, taalcode, notities);
				klantenLijst.add(klant);
			}
			statement.close();
			return klantenLijst;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	//private PreparedStatement initWijzigKlant(Connection connection) {
		//try {
			//PreparedStatement pStatement = connection
					//.prepareStatement(UPDATE_SQL);
			//return pStatement;
		//}
		// detect problems interacting with the database
		//catch (SQLException sqlException) {
			//JOptionPane.showMessageDialog(null, sqlException.getMessage(),
					//"Database Error", JOptionPane.ERROR_MESSAGE);
			//System.exit(1);
		//}
		//return null;
	//}

	//public void wijzigKlant(Klant klant) {
		//Connection connection = PersistentieController.getInstance().getConnection();
		//PreparedStatement pStatement = initWijzigKlant(connection);

		//try {
			//pStatement.setDouble(1, klant.getPrijs());
			//pStatement.setInt(2, klant.getCopyright());
			//pStatement.setString(3, klant.getIsbnNr());
			//pStatement.executeUpdate();
		//} 
		//catch (SQLException e) 
		//{
			//e.printStackTrace();
		//}
		
	//}
	
}
