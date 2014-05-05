// Sum of numbers 
import java.math.BigInteger;
import java.util.Scanner;


public class SpojSum 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		BigInteger first = input.nextBigInteger();
		BigInteger second = input.nextBigInteger();
		System.out.println(first.add(second));
	}
}
