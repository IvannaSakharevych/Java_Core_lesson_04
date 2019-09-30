package Animal;

public class Application {

	public static void main(String[] args) {
		
		
		Animal animal = new Animal("Тигр", 65, 3);
		System.out.println(animal);
		System.out.println();
		
		animal.setNameOfAnimal("Гепард");
		animal.setSpeedOfAnimal(120);
		animal.setAgeOfAnimal(3);
		System.out.println(animal);



	}

}
