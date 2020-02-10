import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TestFile {

	public static void main(String[] args) throws FileNotFoundException {
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
	
	

}
