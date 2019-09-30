package Animal;

public class Animal {
	
	private String nameOfAnimal;
	private double speedOfAnimal;
	private int ageOfAnimal;
	
	public Animal(String nameOfAnimal, double speedOfAnimal, int ageOfAnimal) {
		super();
		this.nameOfAnimal = nameOfAnimal;
		this.speedOfAnimal = speedOfAnimal;
		this.ageOfAnimal = ageOfAnimal;
	}

	public String getNameOfAnimal() {
		return nameOfAnimal;
	}

	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}

	public double getSpeedOfAnimal() {
		return speedOfAnimal;
	}

	public void setSpeedOfAnimal(double speedOfAnimal) {
		this.speedOfAnimal = speedOfAnimal;
	}

	public int getAgeOfAnimal() {
		return ageOfAnimal;
	}

	public void setAgeOfAnimal(int ageOfAnimal) {
		this.ageOfAnimal = ageOfAnimal;
	}

	@Override
	public String toString() {
		return "Назва тварини = " + getNameOfAnimal() + ", Швидкість тварини = " + getSpeedOfAnimal() + " км/год" + ", Вік тварини = " + getAgeOfAnimal() + " років.";
	}
	

}
