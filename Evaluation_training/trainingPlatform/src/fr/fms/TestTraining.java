package fr.fms;

import fr.fms.business.IBusinessImpl;

/**
 * Teste de fonctionnalité.
 */

public class TestTraining {

	private static IBusinessImpl business = new IBusinessImpl();

	public static void main(String[] args) {

		/**
		 * Teste de la méthode display pour afficher la liste des cours. Teste
		 * approuver.
		 */

		displayArticles();

	}

	public static void displayArticles() {
		business.readAllTrainig().forEach(System.out::println);
	}
}
