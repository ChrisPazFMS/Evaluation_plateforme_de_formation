package fr.fms.entities;

public class Category {

	private int idCategory;
	private String catName;
	private String description;

	public Category(int idCategory, String catName, String description) {
		super();
		this.idCategory = idCategory;
		this.catName = catName;
		this.description = description;
	}
	
	public Category(){
		
	}
		

	public int getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {

		return "\u001B[33mN°: \u001B[31m" + idCategory + "\u001B[33m, Nom: \u001B[37m" + catName
				+ ",\u001B[33m Description: \u001B[37m" + description + "\u001B[37m";
	}

}
