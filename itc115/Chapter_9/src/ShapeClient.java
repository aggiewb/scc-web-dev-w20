
public class ShapeClient {

	public static void main(String[] args) {
		double width = 7, height = 5, perimeter, area;
		
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
