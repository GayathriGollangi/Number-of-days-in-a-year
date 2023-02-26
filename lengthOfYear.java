package DateTime;

import java.time.LocalDate;

public class lengthOfYear {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now(); 
		//printing the number of days in a year
		System.out.println("Number of days in a year");
		System.out.println(date.lengthOfYear());
	}
}
