package fr.fms.business;

import java.util.ArrayList;

import fr.fms.dao.Dao;
import fr.fms.dao.DaoFactory;
import fr.fms.entities.Category;
import fr.fms.entities.Training;

public class IBusinessImpl implements IBusiness {

	private Dao<Training> trainingDao = DaoFactory.getTrainingDao();
	private Dao<Category> categoryDao = DaoFactory.getCategoryDao();

	@Override
	public ArrayList<Training> readAllTrainig() {
		return trainingDao.readAll();
	}

	@Override
	public ArrayList<Category> readAllCategories() {

		return categoryDao.readAll();
	}

	@Override
	public ArrayList<Training> readAllByCat(int id) {
		return trainingDao.readAllByCat(id);

	}
}
