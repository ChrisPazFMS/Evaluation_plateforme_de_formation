package fr.fms;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import fr.fms.business.IBusinessImpl;
import fr.fms.entities.Training;
/**
 * @since V1
 * @author PazmanyC
 *
 */
public class ShopTraining {

	private static IBusinessImpl business = new IBusinessImpl();
	private static Scanner scanner = new Scanner(System.in);
/**
 * Partie de l'application.
 * @param args
 * @throws SQLException
 */
	public static void main(String[] args) throws SQLException {

		System.out.println("Bonjour et bienvenu sur la plateforme de formation !\n ");

		int choice = 0;

		while (choice != 6) {
			displayMenu();
			choice = scanInt();
			switch (choice) {
			case 1:
				displayTrainings();
				break;
			case 2:
				displayTrainingByCategories();
				break;
			case 3:
				displayTrainingByPresentiel();
				break;
			case 4:
				displayTrainingByDistanciel();
				break;
			case 5:
				displaySearchByKeywords();
				break;
			case 6:
				System.out.println("Merci pour votre visite sur notre site de formation !");
				break;
			default:
				System.out.println("veuillez saisir une valeur entre 1 et 6");
			}
		}

	}

	/**
	 * Méthode qui affiche le menu principale
	 */
	public static void displayMenu() {

		System.out.println("Saisissez le numéro correspondant à votre demande !\n");
		System.out.println("1 : Afficher toutes les formations disponibles.");
		System.out.println("2 : Afficher les formations par catégorie.");
		System.out.println("3 : Afficher les formations en présentiel.");
		System.out.println("4 : Afficher les formations en distanciel.");
		System.out.println("5 : Rechercher une formation par mot-clé !");

	}

	/**
	 * Méthode qui affiche les cours
	 */
	public static void displayTrainings() {
		business.readAllTrainig().forEach(System.out::println);
	}

	/**
	 * Méthode qui affiche les cours par categories
	 */
	private static void displayTrainingByCategories() {
		System.out.println("\nSaisissez le numéro de la catégorie souhaité !\n");

		business.readAllCategories().forEach(System.out::println);

		int id = scanInt();

		business.readAllByCat(id).forEach(System.out::println);

	}

	/**
	 * Méthode qui renvoie tous les cours en présentiel.
	 */
	private static void displayTrainingByPresentiel() {

		business.readAllByPresentiel().forEach(System.out::println);

	}

	/**
	 * Méthode qui renvoie tous les cours en distanciel.
	 */
	private static void displayTrainingByDistanciel() {

		business.readAllByDistanciel().forEach(System.out::println);

	}

	/**
	 * Méthode qui renvoie tous les cours par mots-clés.
	 */
	private static void displaySearchByKeywords() {
		boolean outScanner = true;
		while (outScanner) {

			System.out.println("\nSaisissez le mot-clé : ");
			System.out.println("Ou STOP pour sortir de la recherche !");

			String key = scanner.next();
			ArrayList<Training> valueString = business.readAllByKeywords(key);

			if (key.equalsIgnoreCase("stop")) {
				outScanner = false;
			} else if (!valueString.isEmpty()) {
				valueString.forEach(System.out::println);

			} else if (outScanner) {
				System.out.println("Il n'y a aucune correspondance pour : " + key);

			}
		}

	}
	
	/**
	 * Méthode qui boucle temps que la valeur n'est pas int
	 * @return
	 */

	public static int scanInt() {
		while (!scanner.hasNextInt()) {
			System.out.println("saisissez une valeur entière svp");
			scanner.next();
		}
		return scanner.nextInt();
	}

}
