package fr.fms;

import java.sql.SQLException;

import java.util.Scanner;

import fr.fms.business.IBusinessImpl;

public class ShopTraining {

	private static IBusinessImpl business = new IBusinessImpl();
	private static Scanner scanner = new Scanner(System.in);

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
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				System.out.println("à bientôt dans notre boutique :)");
				break;
			default:
				System.out.println("veuillez saisir une valeur entre 1 et 8");
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

	public static int scanInt() {
		while (!scanner.hasNextInt()) {
			System.out.println("saisissez une valeur entière svp");
			scanner.next();
		}
		return scanner.nextInt();
	}

}
