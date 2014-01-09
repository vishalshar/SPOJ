import java.util.Scanner;


public class SpojLife 
{
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		int in;
		try
		{
			for(;;)
			{
				in = input.nextInt();
				if(in == 42)
					System.exit(0);
				System.out.println(in);
			}
		}
		catch(Exception e)
		{
			System.exit(0);
		}
	}
}
