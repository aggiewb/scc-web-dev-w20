
public class season_printgpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String season(int month, int day){
	    if(month == 1 || month == 2 || month == 12 && day > 15 || month == 3 && day < 16){
	        return "Winter";
	    } else if(month == 4 || month == 5 || month == 3 && day > 15 || month == 6 && day < 16){
	        return "Spring";
	    } else if(month == 7 || month == 8 || month == 6 && day > 15 || month == 9 && day < 16){
	        return "Summer";
	    } else {
	        return "Fall";
	    }
	}

}
