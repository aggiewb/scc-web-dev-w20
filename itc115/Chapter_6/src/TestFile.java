import java.io.*;


public class TestFile {
	
	public static void main(String[] args) throws FileNotFoundException {
		divideZero();
		
		PrintStream output = new PrintStream(new File("hello.txt"));

		output.println("Hello world");
		output.println();
		output.println("This program produces");
		output.println("four lines of outupt");
		output.println("the old content is gone");
		
		output.close();
		
		testFile1();
	

	}
	
	public static void testFile1() {
		File f = new File("hamlet.txt");
		System.out.println("Exists returns: " + f.exists());
		System.out.println("Can read returns: " + f.canRead());
		System.out.println("Length returns: " + f.length());
		System.out.println("Absolute path returns: " + f.getAbsolutePath());
	}
	
	public static void divideZero() {
		try {
			int a = 30, b = 0;
			int c = a/b;
			System.out.println("Result = " + c);
		} catch(Exception e) {
			System.out.println("STOP!");
		}
	}

}
