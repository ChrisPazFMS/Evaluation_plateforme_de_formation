package fr.fms;

import java.util.ArrayList;
import java.util.Scanner;

import fr.fms.business.IBusinessImpl;
import fr.fms.entities.Training;

/**
 * Test de fonctionnalité.
 */

public class TestTraining {


	private static Scanner scanner = new Scanner(System.in);
	private static IBusinessImpl business = new IBusinessImpl();

	public static void main(String[] args) {

		/**
		 * Test de la méthode display pour afficher la liste des cours [OK]
		 * 
		 */

		displayTrainings();

		/**
		 * Test pour afficher les cours par categories [OK]
		 */

		displayTrainingByCategories();
		
		
		/**
		 * Test qui renvoie tous les cours en présentiel [OK]
		 */
		
		displayTrainingByPresentiel();
		
		/**
		 * Test qui renvoie tous les cours en distanciel [OK]
		 */
		displayTrainingByDistanciel();
		
		/**
		 * Test qui renvoie tous les cours par mots-clés [OK]
		 */
		displaySearchByKeywords();
		
		System.out.println("Fin des tests !");
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

	public static int scanInt() {
		while (!scanner.hasNextInt()) {
			System.out.println("saisissez une valeur entière svp");
			scanner.next();
		}
		return scanner.nextInt();
	}
}
