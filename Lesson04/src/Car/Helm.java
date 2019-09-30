package Car;

public class Helm {
	
	private String mark;
	private double diameter;
		
	public Helm(String mark, double diameter) {
		super();
		this.mark = mark;
		this.diameter = diameter;
	}
	
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
//	Own methods
	public void changeDiameter() {
		setDiameter(diameter + 2);
	}
	
	public void changeMark(String newMark) {
	    this.setMark(newMark);
	  }
	
	@Override
	public String toString() {
		return "Helm [mark=" + mark + ", diameter=" + diameter + "]";
	}
	

}
