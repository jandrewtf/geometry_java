package geometry;

public class Line {
	private Point startPoint;
	private Point endPoint;
	private boolean selected;
	
	public Line() {}
	public Line(Point startPoint) {
		this.startPoint = startPoint;
	}
	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	public Line(Point startPoint, Point endPoint, boolean selected) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.selected = selected;
	}
	
	public Point getStartPoint() {
		return this.startPoint;
	} 
	public Point getEndPoint() {
		return this.endPoint;
	}
	public boolean getSelected() {
		return this.selected;
	}
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	} 
	public void setEndPoint(Point endPoint) {
		 this.endPoint = endPoint;
	}
	public void setSelected(boolean selected) {
		 this.selected = selected;
	}
	
	public double Length() {
		int x1 = this.startPoint.getX();
		int x2 = this.endPoint.getX();
		int y1 = this.startPoint.getY();
		int y2 = this.endPoint.getY();
		return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	}
}
