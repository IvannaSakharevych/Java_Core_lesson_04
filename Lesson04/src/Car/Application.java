package Car;

public class Application {

	public static void main(String[] args) {
		
		Helm helm = new Helm("Mercedes", 40);
		Wheel wheel = new Wheel("BMW", 15);
		Body body = new Body("Audi", "white");
		
		Car car = new Car("Porsche", 2013, helm, wheel, body);
		
	    System.out.println(car.getHelm());
	    System.out.println(car.getWheel());
	    System.out.println(car.getBody());
	    System.out.println();
	
	    car.getHelm().changeMark("Porsche");
	    car.getWheel().changeMark("Porsche");
	    car.getBody().changeMark("Porsche");
	    car.getHelm().changeDiameter();
	    car.getWheel().changeSize();
	    car.getBody().changeColor("red");
	    System.out.println();
	
	    System.out.println(car.getHelm());
	    System.out.println(car.getWheel());
	    System.out.println(car.getBody());
	    System.out.println();
	    
		System.out.println(car);

	}

}
