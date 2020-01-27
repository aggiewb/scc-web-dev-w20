import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		toDateOrNot(35, 60, 60000.00);
		toDateOrNot(90, 44, 1000000);
		//int sum = readSum(console);
		//System.out.println("The sum of your numbers " + sum);
	}
	
	public static int readSum(Scanner console) {
		System.out.println("Type 3 numbers: ");
		int numberOne = console.nextInt();
		int numberTwo = console.nextInt();
		int numberThree = console.nextInt();
		return numberOne + numberTwo + numberThree;
	}
		
	public static void gpa() {
			Scanner console = new Scanner(System.in);
			System.out.print("What is your gpa? ");
			double gpa = console.nextDouble();
			if(gpa >= 2.0) {
				System.out.println("Welcome to Earth University!");
			} else {
				System.out.println("Application denied. :( ");
			}
			console.close();
		}
		
	public static void playaName() {
			Scanner console = new Scanner(System.in);
			System.out.print("Type your name, playa: ");
			String name = console.nextLine();
			int spaceBetweenNames = name.indexOf(" ");
			String firstName = name.substring(0, spaceBetweenNames);
			String lastName = name.substring(spaceBetweenNames);
			System.out.println("Your gangsta name is \"" + name.charAt(0) + " Diddy" + lastName.toUpperCase() + " " + firstName + "-izzle\"");
			console.close();
		}
		
	public static void howOld() {
			Scanner console = new Scanner(System.in);
			System.out.print("How old are you? ");
			int age = console.nextInt();
			System.out.println("You typed " + age);
			console.close();
		}
		
	public static void yourName() {
			Scanner console = new Scanner(System.in);
			System.out.print("What is your name? ");
			String name = console.next();
			name = name.toUpperCase();
			System.out.println(name + " has " + name.length() + " letters and starts with " + name.substring(0, 1));
			console.close();
		}
	
	public static boolean toDateOrNot(int age, int height, double salary) {
		boolean rich = salary >= 100000.00;
		boolean goodAge = age >= 30 && age >= 45;
		boolean goodHeight = height >= 50 && height < 84;
		
		if(goodAge && goodHeight || rich) {
			System.out.println("Ok, let's go out!");
			return true;
		} else {
			System.out.println("It's not you, it's me.");
			return false;
		}
		
	}
		
		
		
	}

