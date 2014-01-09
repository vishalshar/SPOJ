import java.math.BigInteger;
import java.util.Scanner;


public class SpojFactorial 
{
	public static void main(String... args) 
	{
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		for(int i=0;i<cases;i++)
		{
			long value = input.nextLong();
			BigInteger fact = fact(value);
			System.out.println(fact);
		}
	}

	private static BigInteger fact(long n) {
	    BigInteger result = BigInteger.ONE;
	    for (long i = 2; i <= n; i++)
	        result = result.multiply(BigInteger.valueOf(i));
	    return result;
	}

}
