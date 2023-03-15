package fr.fms.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class BddConnection {
	private static Connection connection = null;
	private static String driver;
	private static String url;
	private static String login;
	private static String password;

	private BddConnection() {
		try {
			getConfigFile();
			Class.forName(driver);
			connection = DriverManager.getConnection(url, login, password);

		} catch (FileNotFoundException e) {
			System.out.println("config.properties not found:" + e.getMessage());
		} catch (IOException e) {
			System.out.println("I/O pb : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("pb : " + e.getMessage());
		}
	}

	/**
	 * méthode qui retourne une connection, si inexistante, il l'a crée une seule
	 * fois
	 * 
	 * @return Connection
	 */
	public static Connection getConnection() {
		if (connection == null)
			new BddConnection();
		return connection;
	}

	/**
	 * méthode qui ouvre le fichier de config d'une connection
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	private static void getConfigFile() throws FileNotFoundException, IOException {
		Properties props = new Properties();
		try (FileInputStream fis = new FileInputStream("files/config.properties")) {
			props.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println("Fichier de config non trouvé " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Erreur lecture fichier config " + e.getMessage());
		}
		driver = props.getProperty("db.driver");
		url = props.getProperty("db.url");
		login = props.getProperty("db.login");
		password = props.getProperty("db.password");
	}

}
