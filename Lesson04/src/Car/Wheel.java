package Car;

public class Wheel {
	
	private String mark;
	private double size;
	
	public Wheel(String mark, double size) {
		super();
		this.mark = mark;
		this.size = size;
	}
	
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	
//	Own methods
	public void changeSize() {
		setSize(size * 2);
	}
	
	public void changeMark(String newMark) {
	    this.setMark(newMark);
	  }
	
	@Override
	public String toString() {
		return "Wheel [mark=" + mark + ", size=" + size + "]";
	}
	

}
