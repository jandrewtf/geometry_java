package geometry;

public class Circle {
	private Point centar;
	private int radius;
	private boolean selected;
	
	public Circle() {
	}
	public Circle(Point centar) {
		this.centar = centar;
	}
	public Circle(Point centar, int radius) {
		this.centar = centar;
		this.radius = radius;
	}
	public Circle(Point centar, int radius, boolean selected) {
		this.centar = centar;
		this.radius = radius;
		this.selected = selected;
	}

	public Point getCentar() {
		return centar;
	}
	
	public void setCentar(Point centar) {
		this.centar = centar;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public double area() {
		return Math.PI * this.radius * this.radius;
	}
	
	public double circumference() {
		return 2*this.radius*Math.PI;
	}
}
