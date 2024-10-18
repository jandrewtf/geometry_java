package geometry;

public class Point {
	private int x;
	private int y;
	private boolean selected;
	
	public Point() {
		
	}
	
	public Point(int x) {
		this.x = x;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point(int x, int y, boolean selected) {
		this.x = x;
		this.y = y;
		this.selected = selected;
	}
	
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public boolean getSelected() {
		return this.selected;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
}
