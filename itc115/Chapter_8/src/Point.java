//Point object to represent a pair of coordinates
public class Point {
	//fields(attributes)
	private int x;
	private int y;
	
	//constructor to construct a new point with the given x and y location
	public Point (int initialX, int initialY) {
		x = initialX;
		y = initialY;
	}
	
	//return the distance to point of origin(0,0)
	public double distanceFromOrigin() {
		return Math.sqrt(x * x + y * y);
	}
	
	//shift point to new coordinate
	public void translate(int dX, int dY) {
		x += dX;
		y += dY;
	}
	
	public static void hiPoint() {
		System.out.println("Hi from the static method");
	}

}
