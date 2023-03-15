package fr.fms.business;

import java.util.ArrayList;

import fr.fms.entities.Category;
import fr.fms.entities.Training;

public interface IBusiness {

	/**
	 * Méthode qui renvoi tous les cours de la table T_Training en bdd.
	 * 
	 * @return Liste des cours en base
	 */
	public ArrayList<Training> readAllTrainig();

	/**
	 * Méthode qui renvoi toutes les catégories des cours de la table T_Catégories
	 * en bdd
	 * 
	 * @return Liste de catégories en base
	 */
	public ArrayList<Category> readAllCategories();

	/**
	 * Méthode qui renvoie tous les cours des catégories sélectionnées
	 * 
	 * @param id
	 * @return Liste des catégories sélectionnées de la table T_Training en bdd
	 */
	public ArrayList<Training> readAllByCat(int id);

	/**
	 * Méthode qui renvoie tous les cours en présentiel
	 * 
	 * @return Liste des cours en présentiel de la table T_Training en bdd
	 */
	public ArrayList<Training> readAllByPresentiel();

	/**
	 * Méthode qui renvoie tous les cours en distanciel
	 * 
	 * @return Liste des cours de la table T_Training en bdd
	 */
	public ArrayList<Training> readAllByDistanciel();

	/**
	 * Méthode qui renvoie tous les cours par mots-clés
	 * 
	 * @param key
	 * @return Liste des cours de la table T_Training en bdd par recherche de
	 *         mot-clé
	 */
	public ArrayList<Training> readAllByKeywords(String key);

}
