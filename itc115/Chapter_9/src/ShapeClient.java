
public class ShapeClient {

	public static void main(String[] args) {
		double radius = 7, perimeter, area;
		
		Circle circle = new Circle(radius);
		area = circle.calculateArea();
		System.out.println(area);
		
		perimeter = circle.calculatePerimeter();
		//System.out.println(circle.toString());
		System.out.println(perimeter);
		
		circle.setRadius(9);
		
		perimeter = circle.calculatePerimeter();
		//System.out.println(circle.toString());
		System.out.println(perimeter);
		
		double width = 7, height = 5;
		
		Rectangle rect1 = new Rectangle(width, height);
		area = rect1.calculateArea();
		System.out.println(area);
		
		perimeter = rect1.calculatePerimeter();
		//System.out.println(rect1.toString());
		System.out.println(perimeter);
		
		rect1.setWidth(9);
		
		perimeter = rect1.calculatePerimeter();
		//System.out.println(rect1.toString());
		System.out.println(perimeter);

	}

}
