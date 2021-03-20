/**
 * Name:Locharla Tanuja
 * Description:La31:Method to accept the date difference and print the duration in days months and years to the system date
 * Date:17/03/2021
 */



package lab3;
import java.time.LocalDate;
import java.time.Period;

public class DurationDifference {
	static void durationDifference(LocalDate date,LocalDate current_date) //for giving difference between given date to system date
    { 
  
        Period difference = Period .between(date, current_date); 
  
        System.out.print( "Difference between two dates is: "); 
  
        
        System.out.printf( "%d years, %d months,  and %d days ", difference.getYears(), difference.getMonths(), difference.getDays()); 
    } 
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2018, 01, 10); 
		  
        
        LocalDate current_date  = java.time.LocalDate.now();
        
        durationDifference(date, current_date); 
		// TODO Auto-generated method stub

	}

}
