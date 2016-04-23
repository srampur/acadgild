/*
 * Session 1 : Control Structures
Assignment 
–
To print prime numbers between 1 and 100

Output:
Prime numbers between 1 and 100 
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
 */
public class PrintPrimeDemo {

	private boolean isPrime(int num)
	{
		for(int i=2; i<=num/2; i++)
		{
			if(num % i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		PrintPrimeDemo obj = new PrintPrimeDemo();
		
		for(int i = 2 ; i <=100; i++)
		{
			//System.out.print(" Is "+i+" prime ");
			if(obj.isPrime(i))
				System.out.print(i + " ");
		}
		System.out.println();

	}

}
