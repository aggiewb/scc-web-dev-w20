
public class Rectangle extends Shape {
	private double width;
	private double height;
	
	//constructor
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double calculateArea() {
		double area = width * height;
		return area;
	}
	
	public double calculatePerimeter() {
		double perimeter = 2* (width + height);
		return perimeter;
	}

}
