package Car;

public class Car {
	
	private String mark;
	private int year;
	private Helm helm;
	private Wheel wheel;
	private Body body;
	
	public Car(String mark, int year, Helm helm, Wheel wheel, Body body) {
		super();
		this.mark = mark;
		this.year = year;
		this.helm = helm;
		this.wheel = wheel;
		this.body = body;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Car [mark=" + mark + ", year=" + year + ", helm=" + helm + ", wheel=" + wheel + ", body=" + body
				 + "]";
	}
	
	

}
