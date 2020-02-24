
import java.util.*;

public class AntCrawl {

	public static void main(String[] args) {
		crawl();

	}
	
	public static void crawl() {
		int height = 0;
		int falls = 0;
		Random rand = new Random();
		
		boolean upDown = rand.nextBoolean(); 
		
		while(height < 6) {
			if(upDown == true) {
				height++;
			} else if(upDown == false && height <= 0) {
				height = 0;
				falls++;
			} else {
				height--;
				falls++;
			}
			upDown = rand.nextBoolean();
		}
		
		System.out.println("The ant made it to the " + height + "th stair!");
		System.out.println("number of falls: " + falls);
	}

}
