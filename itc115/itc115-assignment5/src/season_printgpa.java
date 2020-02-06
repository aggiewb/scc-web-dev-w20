
import java.util.*;

public class season_printgpa {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		printGPA(console);
		season(1, 21);
		season(2, 28);
		season(3, 15);
		season(3, 16);
		season(4, 1);
		season(6, 15);
		season(6, 16);
		season(8, 9);
		season(9, 15);
		season(9, 16);
		season(10, 31);
		season(12, 15);
		season(12, 16);
	}
	
	public static String season(int month, int day){
	    if(month == 1 || month == 2 || month == 12 && day > 15 || month == 3 && day < 16){
	        System.out.println("Winter");
	    	return "Winter";
	    } else if(month == 4 || month == 5 || (month == 3 && day > 15) || (month == 6 && day < 16)){
	        System.out.println("Spring");
	    	return "Spring";
	    } else if(month == 7 || month == 8 || (month == 6 && day > 15) || (month == 9 && day < 16)){
	        System.out.println("Summer");
	    	return "Summer";
	    } else {
	        System.out.println("Fall");
	    	return "Fall";
	    }
	}
	
	public static void printGPA(Scanner console){
	    System.out.print("Enter a student record: ");
	    String studentRecord = console.nextLine();
	    console.close();
	   
	    int spaceBetween = studentRecord.indexOf(" ");
	    String studentName = "";
	    
	    for(int i = 0; i < spaceBetween; i++){
	          studentName = studentName + studentRecord.charAt(i);
	    }
	    
	    int numOfScores = Character.getNumericValue(studentRecord.charAt(studentName.length() + 1));
	    
	    String num = "";
	    int sum = 0;
	    for(int i = studentName.length() + 3; i < studentRecord.length(); i++){
	       if(Character.isDigit(studentRecord.charAt(i))){
	           num = num + studentRecord.charAt(i);
	       } else {
	           if (num.length() == 1){
	               sum += Character.getNumericValue(num.charAt(0));
	           } else if (num.length() == 2){
	                sum += Character.getNumericValue(num.charAt(0)) * 10;
	                sum += Character.getNumericValue(num.charAt(1));
	           } else if (num.length() == 3){
	               sum += Character.getNumericValue(num.charAt(0)) * 100;
	               sum += Character.getNumericValue(num.charAt(1)) * 10;
	               sum += Character.getNumericValue(num.charAt(2));
	           }
	           num = "";
	       }
	    }
	    
	    if (num.length() == 1){
	        sum += Character.getNumericValue(num.charAt(0));
	    }else if(num.length() == 2){
	       sum += Character.getNumericValue(num.charAt(0)) * 10;
	       sum += Character.getNumericValue(num.charAt(1));
	    } else if (num.length() == 3){
	        sum += Character.getNumericValue(num.charAt(0)) * 100;
	        sum += Character.getNumericValue(num.charAt(1)) * 10;
	        sum += Character.getNumericValue(num.charAt(2));
	    }
	       
	    double studentGPA = (double)sum / numOfScores;
	    System.out.println(studentName + "\'s grade is " + studentGPA);
	}

}
