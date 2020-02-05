
public class season_printgpa {

	public static void main(String[] args) {
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
