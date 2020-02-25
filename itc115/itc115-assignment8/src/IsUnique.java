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
		int[] arr1 = {2, 4, 6}; 
		System.out.println(isUnique(arr1));
		// return true
		
		int[] arr2 = {};
		System.out.println(isUnique(arr2));
		// return true
		
		int[] arr3 = {1};
		System.out.println(isUnique(arr3));
		//return true
		
		int[] arr4 = {1, 3, 3};
		System.out.println(isUnique(arr4));
		//return false
		
		int[] arr5 = {2, 4, 6, 8, 10, 12, -2, -4};
		System.out.println(isUnique(arr5));
		//return true
		
		int[] arr6 = {2, 4, 6, 8, 10, 12, -2, -4, 2};
		System.out.println(isUnique(arr6));
		//return false

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
