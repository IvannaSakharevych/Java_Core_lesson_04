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
		this.action = "������ ������";
	}

	public void work() {
		
		System.out.println("� " + this.name + " - � " + this.action + ".");
		
	}

}
