package Car;

public class Body {
	
	private String mark;
	private String color;
		
	public Body(String mark, String color) {
		super();
		this.mark = mark;
		this.color = color;
	}
	
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
//	Own methods
	public void changeColor(String newColor) {
		this.setColor(newColor);
	}
	
	public void changeMark(String newMark) {
	    this.setMark(newMark);
	  }
	
	@Override
	public String toString() {
		return "Body [mark=" + mark + ", color=" + color + "]";
	}
	

}
