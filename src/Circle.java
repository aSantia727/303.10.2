
public class Circle extends Shape{
	protected double radius;
	private final double PI = Math.PI;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, double height) {
	}
	public double getArea() {
		super.area = PI * Math.pow(this.radius, 2);
		return super.area;
	}
	@Override
	public void displayshapName() {
		System.out.println("Drawing c Circle of radius " + this.radius);
	}
	@Override
	public String toSTring() {
		return "Circle[ radius = " + radius + super.toString() + "]";
	}
}