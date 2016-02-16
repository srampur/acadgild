/**
 * Give two examples of data that cannot be stored in a variable of type int
 * This class does not compile because of the issue in type conversion
 */
public class UnableToStore
{
	public static void main(String args[])
	{
		int iNum;
		long lNum = 40000;
		double dNum = 41000.4;
		/* convert long to integer */
		iNum = lNum;
		/* convert double to integer */
		iNum = dNum;
	}
}
