package Robot;

public class Robot {
	
	private String name;
	private String action;
		
	public Robot (String name, String action) {
//		super();
		this.name = name;
		this.action = action;
	}
	
	public Robot () {
//		super();
		this.name = "Robot";
		this.action = "ïðîñòî ïðàöþþ";
	}

	public void work() {
		
		System.out.println("Я " + this.name + " - Я " + this.action + ".");
		
	}

}
