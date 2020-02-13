import java.io.*;
import java.util.*;

//This program contains a method named boyGirl that accepts a Scanner as a parameter. 
//The Scanner reads its input from a file containing a series of names followed by integers. 
//The files contains names that alternate between boys' names and girls' names. 
//The boyGirls methods also compute the absolute difference between the sum of the boys' integers and the sum of the girls' integers. 
//The input could end with either a boy or girl, and may be an uneven number of names.
//Aggie Wheeler Bateman
//2020 Feb 13

public class BoysGirls {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("boysgirls.txt"));
		boyGirl(input);
	}
	
	public static void boyGirl(Scanner console) throws FileNotFoundException{
		int boys = 0;
		int boysCount = 0;
		
		int girls = 0;
		int girlsCount = 0;
		
		int count = 0;
		int difference = 0;
		    
		while(console.hasNext()){
			console.next();
			count++;
			if(count % 2 == 0){
				girlsCount++;
				girls += console.nextInt();
				} else if (count % 2 != 0){
					boysCount++;
					boys += console.nextInt();
					}
			}
		
		if(boys > girls){
			difference = boys - girls;
			} else {
				difference = girls - boys;
				}
		
		System.out.println(boysCount + " boys, " + girlsCount + " girls");
		System.out.println("Difference between boys' and girls' sums: " + difference);
		}	
	}

