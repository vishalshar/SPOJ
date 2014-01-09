import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class SpojPrime {
	
	public static List<Integer> prime = new ArrayList<Integer>();
	
	public static void primegenerate(int start,int end)
	{
		boolean result = false;
		if(start == 1)
			start = start+1;
		
		for(int i=start;i<=end;i++)
		{
			result = true;
			int root = (int) Math.sqrt(i);
			
			for(int j=0;j<3401;j++)
			{
				if(prime.get(j) > root)
					break;
				
				if(i % prime.get(j) == 0)
				{
					result = false;
					break;
				}
			}
			if(result)
				System.out.println(i);
		}
	}
	
	public static void main(String[] args) 
	{
		primeGenerate((int) Math.sqrt(1000000000));		
		
		Scanner sc = new Scanner(System.in);
		int t, m, n, i, k, a, flag;
		t = sc.nextInt();
		for (i = 0; i < t; i++) 
		{
			m = sc.nextInt();
			n = sc.nextInt();
			primegenerate(m,n);
		}
	}
	
    public static void primeGenerate(int N) 
    {
        boolean[] isPrime = new boolean[N + 1];
        for (int i = 2; i <= N; i++) 
        {
            isPrime[i] = true;
        }
        for (int i = 2; i*i <= N; i++) 
        {
            if (isPrime[i]) 
            {
                for (int j = i; i*j <= N; j++) 
                {
                    isPrime[i*j] = false;
                }
            }
        }
        
        int primes = 0;
        for (int i = 2; i <= N; i++) 
        {
            if (isPrime[i])
            {
            	primes++;
            	prime.add(i);
            }
        }
    }
}