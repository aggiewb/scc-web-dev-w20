
import java.util.*;

//This class includes two methods call season and printGPA.
//Above each class is a commented description of its purpose.
//Aggie Wheeler Bateman
//6 Feb 2019

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
	
//The following is a method that takes two integers as parameters representing a month and day 
//and returns a String indicating the season for that month and day. 
//If the date falls between 12/16 and 3/15, "Winter" will be returned. 
//If the date falls between 3/16 and 6/15, "Spring" will be returned. 
//If the date falls between 6/16 and 9/15, "Summer" will be returned. 
//If the date falls between 9/16 and 12/15, "Fall" will be returned. 
	
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
	
//The following is a method that calculates a student's grade point average. 
//The user will type a line of input containing the student's name, 
//then a number of scores, followed by that many integer scores.
	
	public static void printGPA(Scanner console){
	    System.out.print("Enter a student record: ");
	    String studentRecord = console.nextLine();
	    console.close();
	   
	    int spaceBetween = studentRecord.indexOf(" ");
	    
	    String studentName = studentRecord.substring(0, spaceBetween);
	    
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
