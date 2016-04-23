import java.util.Scanner;

/*
 * Assignment 
–
To check total number of days in the given month.  
 * Expected Output
Should print 
total number of days in the given month
 */
public class PrintDaysOfMonth {

	public static void main(String[] args) {
		int month = 0;
		Scanner s = new Scanner (System.in);
		
		System.out.println("Please enter the month");
		month = s.nextInt();
		switch(month)
		{
		case 1:
			System.out.println("January 31 days");
			break;
		case 2:
			System.out.println("February 28 in leap 29 days");
			break;
		case 3:
			System.out.println("March 31 days");
			break;
		case 4:
			System.out.println("April 30 days");
			break;
		case 5:
			System.out.println("May 31 days");
			break;
		case 6:
			System.out.println("June 30 days");
			break;
		case 7:
			System.out.println("July 31 days");
			break;
		case 8:
			System.out.println("August 31 days");
			break;
		case 9:
			System.out.println("September 30 days");
			break;
		case 10:
			System.out.println("Ocotber 31 days");
			break;
		case 11:
			System.out.println("November 30 days");
			break;
		case 12:
			System.out.println("December 31 days");
			break;
			default:
				System.out.println("Invalid month, please enter between 1-12");
				break;
		}
		s.close();
	}

}
