import java.util.*;

/*This class contains a method named isUnique that takes an array of integers as a parameter and that returns a boolean 
 * value indicating whether or not the values in the array are unique (true for yes, false for no). 
 * The values in the list are considered unique if there is no pair of values that are equal. 
 * 
 * Aggie Wheeler Bateman
 * 2/25/20
 */
public class IsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isUnique(int[] num){
	    boolean isUnique = true;
	    
	    for(int i = 0; i < num.length - 1; i++){
	        for(int j = i + 1; j < num.length; j++){
	            if(num[i] == num[j]){
	                isUnique = false;
	                return isUnique;
	            }
	        }
	    }
	    
	    return isUnique;
	}

}
