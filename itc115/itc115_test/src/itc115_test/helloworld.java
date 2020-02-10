package itc115_test;

public class helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World!");
		
		for (int i = 0; i < 5; i++) {
			drawBoxes();
			}
		}
	
	public static void drawBoxes() {
		String horizontal = "+---+";
		String vertical = "|   |";
		System.out.println(horizontal);
		System.out.println(vertical);
		System.out.println(vertical);
		System.out.println(horizontal);
	}

}
