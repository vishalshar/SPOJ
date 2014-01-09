import java.text.DecimalFormat;
import java.util.Scanner;


public class SpojSumSeries 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
			int cases = input.nextInt();
			for(int i=0;i<cases;i++)
			{
				int value = input.nextInt();
				
				float x = (value*value) + value + 1;
				x = 1-(1/x);
				x = x/2;
				float result = Round(x,6);
				DecimalFormat form = new DecimalFormat("0.0000");  
			    System.out.println(form.format(result));  
			}
	}
	
	 public static float Round(float Rval, int Rpl) 
	 {
		  float p = (float)Math.pow(10,Rpl);
		  Rval = Rval * p;
		  float tmp = Math.round(Rval);
		  return (float)tmp/p;
	 }
}
