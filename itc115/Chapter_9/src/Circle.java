
public class Circle extends Shape {
	private double radius;
	
	//constructor
		public Circle(double radius) {
			this.radius = radius;
		}
	
		public double calculateArea() {
			double area = Math.PI * this.radius * this.radius;
			return area;
		}
		
		public double calculatePerimeter() {
			double perimeter = 2 * Math.PI * this.radius;
			return perimeter;
		}

		public double getRadius() {
			return radius;
		}

		public void setRadius(double radius) {
			this.radius = radius;
		}
}
