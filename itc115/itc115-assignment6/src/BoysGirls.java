import java.io.*;
import java.util.*;

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

