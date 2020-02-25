
import java.util.*;

public class IsSorted {
	
	public static void main(String[] args) {
		double[] arr1 = {16.1, 12.3, 22.2, 14.4}; 
		System.out.println(isSorted(arr1));
		//returns false
		
		double[] arr2 = {42};
		System.out.println(isSorted(arr2));
		//returns true
		
		double[] arr3 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		System.out.println(isSorted(arr3));
		//returns true
		
		double[] arr4 = {42.0, 27.0};
		System.out.println(isSorted(arr4));
		//returns false
		

	}
	
	public static boolean isSorted(double[] num){
	    boolean isSorted = false;
	    
	    double[] newNum = Arrays.copyOf(num, num.length);
	    
	    for(int i = 0; i < newNum.length - 1; i++){
	        for(int j = i + 1; j < newNum.length; j++){
	            if(newNum[i] > newNum[j]){
	                double temp = newNum[i];
	                newNum[i] = newNum[j];
	                newNum[j] = temp;
	            }
	        }
	    }
	    
	    if(Arrays.equals(newNum, num)){
	        isSorted = true;
	    }
	       
	    return isSorted;
	}

}
