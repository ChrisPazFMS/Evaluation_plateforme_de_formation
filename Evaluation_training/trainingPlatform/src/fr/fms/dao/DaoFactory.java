package fr.fms.dao;

import fr.fms.entities.Category;
import fr.fms.entities.Training;

public class DaoFactory {
	
	public static Dao<Training> getTrainingDao() {
		return new TrainingDao();		
	}
	
	public static Dao<Category> getCategoryDao() {
 		return new CategoryDao();
 	}
}
