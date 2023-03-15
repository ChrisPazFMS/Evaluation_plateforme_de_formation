package fr.fms.dao;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fr.fms.entities.Category;

public class CategoryDao implements Dao<Category> {

	@Override
	public boolean create(Category obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Category obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Category obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Category> readAll() {
		ArrayList<Category> categories = new ArrayList<Category>();
		String sql = "select * from T_Categories";
		try (Statement statement = connection.createStatement()) {
			try (ResultSet resultSet = statement.executeQuery(sql)) {
				while (resultSet.next()) {
					categories.add(new Category(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3)));
				}
				return categories;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Category read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Category> readAllByCat(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Category> readAllPresentiel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Category> readAllDistanciel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Category> readAllByKeywords(String key) {
		// TODO Auto-generated method stub
		return null;
	}

}
