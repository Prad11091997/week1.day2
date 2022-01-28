package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int input = 13;
		boolean isPrime = false;
		for (int i = 2; i <= input / 2; i++) 
		{
			if (input % i == 0) 
			{
			isPrime = true;
			break;
			}
		}
if (isPrime = true) 


	System.out.println(input+" is not a Prime number");
else
	System.out.println(input+" is a Prime number");

	}


}
