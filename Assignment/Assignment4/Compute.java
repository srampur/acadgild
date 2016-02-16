/**
 * Assume that the integer variable x is 5 and the integer variable y is 10. 
 * Give the values of the following 
 * expressions:
 * a. x + y * 2
 * b. x - y + 2
 * c. (x+y) * 2
 * d. y % x
 */
public class Compute
{
	public static void main(String args[])
	{
		int x = 5, y = 10;
		int a = x + y * 2;
		int b = x - y + 2;
		int c = (x+y) * 2;
		int d = y % x;
		System.out.println("x = " + x +" y = " + y);
		System.out.println("x + y * 2 = " + a);
		System.out.println("x - y + 2 = " + b);
		System.out.println("(x+y) * 2 = " + c);
		System.out.println("y % x = " + d);
	}
}
