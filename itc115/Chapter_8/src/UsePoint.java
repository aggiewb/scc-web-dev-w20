
public class UsePoint {
	public static void main(String[] args) {
		//create an instance of a Point object
		Point p = new Point(2, 3);
		
		//get distance from origin (0,0)
		double d = p.distanceFromOrigin();
		System.out.println("Distance: " + d);
		
		//change x and y coordinates by 3 and 5
		p.translate(3, 5);
		
		//demonstrate static method within a class
		Point.hiPoint();

	}

}
