package fr.fms.entities;

public class Training {

	private int idTraining;
	private String nameTraining;
	private String description;
	private int dayOfTraining;
	private String conditionTraining;
	private double pricePerCourse;
	private int idCategory;

	public Training() {

	}

	public Training(int idTraining, String nameTraining, String description, int dayOfTraining, String conditionTraining, double pricePerCourse, int idCategory) {
		
		setIdTraining(idTraining);
		setNameTraining(nameTraining);
		setDescription(description);
		setDayOfTraining(dayOfTraining);
		setConditionTraining(conditionTraining);
		setPricePerCourse(pricePerCourse);
		setIdCategory(idCategory);
	}


	public int getIdTraining() {
		return idTraining;
	}

	public void setIdTraining(int idTraining) {
		this.idTraining = idTraining;
	}

	public String getNameTraining() {
		return nameTraining;
	}

	public void setNameTraining(String nameTraining) {
		this.nameTraining = nameTraining;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDayOfTraining() {
		return dayOfTraining;
	}

	public void setDayOfTraining(int dayOfTraining) {
		this.dayOfTraining = dayOfTraining;
	}

	public double getPricePerCourse() {
		return pricePerCourse;
	}

	public void setPricePerCourse(double pricePerCourse) {
		this.pricePerCourse = pricePerCourse;
	}

	public int getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}

	@Override
	public String toString() {
		return "\u001B[33mN°: \u001B[31m" + idTraining + "\u001B[33m, Formation: \u001B[37m" + nameTraining
				+ ",\u001B[33m Description: \u001B[37m" + description + "\u001B[33m, Sur: \u001B[37m" + dayOfTraining
				+ " jours,\u001B[33m Condition: \u001B[37m" + conditionTraining + " \u001B[33m Prix: \u001B[37m" + pricePerCourse + " €,\u001B[33m Categorie: \u001B[37m" + idCategory;
	}



	public String getConditionTraining() {
		return conditionTraining;
	}


	public void setConditionTraining(String conditionTraining) {
		this.conditionTraining = conditionTraining;
	}

}
