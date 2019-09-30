package Robot;

public class Application {

	public static void main(String[] args) {
		
		Robot robot = new Robot();
		robot.work();
		
		CoffeRobot coffeeRobot = new CoffeRobot();
	    coffeeRobot.work();
	    
	    RobotDancer robotDancer = new RobotDancer();
	    robotDancer.work();
	
	    RobotCoocker robotCoocker = new RobotCoocker();
	    robotCoocker.work();
	    
	    System.out.println();
	    
	    Robot[] robots = {robot, coffeeRobot, robotDancer, robotCoocker};
	    for (int i = 0; i < robots.length; i++) {
	      robots[i].work();
	    }

	}

}
