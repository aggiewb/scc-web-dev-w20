import java.io.*;
import java.util.*;

public class BoysGirls {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("boysgirls.txt"));
		boyGirl(input);
	}
	
	public static void boyGirl(Scanner console) throws FileNotFoundException{
		int boys = 0;
		int girls = 0;
		int count = 0;
		int difference = 0;
		    
		while(console.hasNext()){
			count++;
			
			if(count % 2 == 0){
				girls++;
				} else if (count % 2 == 0){
					boys++;
					}
			console.next();
			}
		
		if(boys > girls){
			difference = boys - girls;
			} else {
				difference = girls - boys;
				}
		
		System.out.println(boys + " boys, " + girls + " girls");
		System.out.println("Difference between boys' and girls' sums: " + difference);
		}	
	}

