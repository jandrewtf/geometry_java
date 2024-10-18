package geometry;

public class Testing {

	public static void main(String[] args) {
		Point a = new Point(0,0);
		Point b = new Point(15,10);
		Line c = new Line(a, b);
		Rectangle d = new Rectangle(a, 2,5);
		Circle g = new Circle(b, 4);

		System.out.println(c.Length());
		System.out.println(d.area());
		System.out.println(d.circumference());
		System.out.println(g.area());
		System.out.println(g.circumference());
	}

}
