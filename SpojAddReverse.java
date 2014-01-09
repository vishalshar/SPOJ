import java.util.Scanner;


public class SpojAddReverse 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		input.nextLine();
		
		for(int i=0;i<cases;i++)
		{
			String value = input.nextLine();
			String val[] = value.split(" ");
			StringBuffer s = new StringBuffer();
			s.append(val[0]);
			
			int fir = Integer.parseInt(s.reverse().toString());
			s = new StringBuffer();
			
			s.append(val[1]);
			int sec = Integer.parseInt(s.reverse().toString());
						
			int result = fir + sec;
			s = new StringBuffer();
			s.append(result);
			result = Integer.parseInt(s.reverse().toString());
			System.out.println(result);
			
		}
	}
}
