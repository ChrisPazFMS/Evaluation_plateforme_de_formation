package fr.fms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fr.fms.entities.Training;

public class TrainingDao implements Dao<Training> {

	public TrainingDao() {

	}

	@Override
	public boolean create(Training obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Training read(int id) {
		try (Statement statement = connection.createStatement()) {
			String str = "SELECT * FROM T_Training where IdTraining=" + id + ";";
			ResultSet rs = statement.executeQuery(str);
			if (rs.next()) {
				System.out.println(new Training(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),
						rs.getString(5), rs.getFloat(6), rs.getInt(7)));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean update(Training obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Training obj) {
		// TODO Auto-generated method stub
		return false;
	}

	public ArrayList<Training> readAll() {

		ArrayList<Training> training = new ArrayList<Training>();
		String strSql = "SELECT * FROM T_Training";

		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(strSql);
			while (resultSet.next()) {
				int idTraining = resultSet.getInt(1);
				String nameTraining = resultSet.getString(2);
				String description = resultSet.getString(3);
				int dayOfTraining = resultSet.getInt(4);
				String conditionTraining = resultSet.getString(5);
				double pricePerCourse = resultSet.getDouble(6);
				int idCategory = resultSet.getInt(7);
				training.add((new Training(idTraining, nameTraining, description, dayOfTraining, conditionTraining,  pricePerCourse,
						idCategory)));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return training;

	}

	public ArrayList<Training> readAllByCat(int id) {
		ArrayList<Training> trainingCategory = new ArrayList<Training>();
		String strSql = "SELECT * FROM T_Training where IdCategory=" + id;
		try (Statement statement = connection.createStatement()) {
			try (ResultSet resultSet = statement.executeQuery(strSql)) {
				while (resultSet.next()) {
					int idTraining = resultSet.getInt(1);
					String nameTraining = resultSet.getString(2);
					String description = resultSet.getString(3);
					int dayOfTraining = resultSet.getInt(4);
					String conditionTraining = resultSet.getString(5);
					double pricePerCourse = resultSet.getDouble(6);
					int idCategory = resultSet.getInt(7);
					trainingCategory.add((new Training(idTraining, nameTraining, description, dayOfTraining,
							conditionTraining, pricePerCourse, idCategory)));
				}
			}
		} catch (SQLException e) {

			e.getMessage();
		}
		return trainingCategory;
	}

}
