package persistentie;

import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Connection;

public class Connectie {
	
//	 JDBC driver name and database URL
	private static final String JDBC_DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";

	private static final String DATABASE_URL = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=groep47hotelboeking";

	//OF
	//private static final String DATABASE_URL = "jdbc:odbc:MS Access-database;DBQ=books";

	// declare Connection for accessing and querying database
	private Connection connection;

	/**
	 * @directed true
	 */

	// constructor connects to database
	public Connectie() {
		// connect to database books 
		try {
			// load database driver class
			Class.forName(JDBC_DRIVER);

			// establish connection to database
			connection = DriverManager.getConnection(DATABASE_URL);

		} catch (SQLException sqlException) {
			JOptionPane.showMessageDialog(null, sqlException.getMessage(),
					"Database Error", JOptionPane.ERROR_MESSAGE);

			System.exit(1);
		}
		// detect problems loading database driver
		catch (ClassNotFoundException classNotFound) {
			JOptionPane.showMessageDialog(null, classNotFound.getMessage(),
					"Driver Not Found", JOptionPane.ERROR_MESSAGE);

			System.exit(1);
		}
	}

	public void closeConnection() {
		try {
			connection.close();
		}

		// handle exceptions closing statement and connection
		catch (SQLException sqlException) {
			JOptionPane.showMessageDialog(null, sqlException.getMessage(),
					"Database Error", JOptionPane.ERROR_MESSAGE);

			System.exit(1);
		}
	}

	public Connection getConnection() {
		return connection;
	}
	
}
