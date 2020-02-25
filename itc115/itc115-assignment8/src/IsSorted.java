
import java.util.*;

public class IsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
