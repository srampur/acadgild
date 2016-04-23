/*
 * Session 1 : Control Structures
Assignment 
–
Print pattern

Output:
1 
12 
123 
1234 
12345 
1234 
123 
12 
1
 */
public class PrintPattern {

	private final static int MAX = 5;
	private static boolean flag = false;
	public static void main(String[] args) {
		
		for(int i=1; i <= MAX; i++)
		{
			if(!flag)
			{
				/* Comparing with i makes j in print control*/
				for(int j=1; j<=i;j++)
					System.out.print(j);
			}
			else
			{
				/* Comparing with i makes j in print control*/
				for(int j=1; j<=(MAX-i);j++)
					System.out.print(j);				
			}

			if ((i==5) && !flag)
			{
				i=0; /*Assigning 1 causes the mismatch in pattern as i++ increments by 2*/
				flag = true ;
			}

			System.out.println();
		}
		
	}

}
