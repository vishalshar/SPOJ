import java.util.Scanner;


public class SpojSubString 
{
	public static void main(String args[])
	{
		boolean result = false;
		Scanner in = new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			result = false;
			String input = in.nextLine();
			String values[] = input.split(" ");
			String a = values[0];
			String b = values[1];
			for(int j=0;j<(a.length()-5);j++)
			{
				String sub = a.substring(j, j+5);
				if(sub.equals(b))
				{
					result = true;
					break;
				}
			}
			if(result)
				System.out.println(1);
			else
				System.out.println(0);
		}
	}
}
