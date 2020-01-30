
public class Repl {
	//This class Repl contains a method called repl accepts a String and a number of repetitions as parameters
	//and returns the String concatenated that many times. It also contains a main method which calls the repl
	//method several times with different parameters for testing.
	
	//Aggie Wheeler Bateman
	
	//30 Jan 2020
	public static void main(String[] args) {
		repl("hello", 3);
		repl("!", 23);
		repl("stop", 0);
		repl("go", -1);
		repl("great job! ", 5);

	}
	
	public static String repl(String phrase, int repetitions){
	    
	    String newPhrase = "";
	    
	    if(repetitions <= 0){
	    	System.out.println(newPhrase);
	        return newPhrase;
	    } 
	    
	    for(int i = 0; i < repetitions; i++){
	        newPhrase+=phrase;
	    }
	    
	    System.out.println(newPhrase);
	    return newPhrase;
	    
	}

}
