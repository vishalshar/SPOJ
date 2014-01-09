import java.util.Scanner;


public class SpojAntiBlot 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		input.nextLine();
		
		for(int i=0;i<cases;i++)
		{
			input.nextLine();
			String test = input.nextLine();
			String values[] = test.split(" ");
			String value1 = values[0];
			String value2 = values[2];
			String result = values[4];
			
			int one,two,rslt;
			
			if(result.contains("m"))
			{
				one = Integer.parseInt(value1);
				two = Integer.parseInt(value2);
				System.out.println(one+" "+"+ "+two+" "+"= "+(one+two));
				continue;
			}
			
			if(value1.contains("m"))
			{
				two = Integer.parseInt(value2);
				rslt = Integer.parseInt(result);
				System.out.println((rslt-two)+" "+"+ "+two+" "+"= "+rslt);
				continue;
			}
			
			if(value2.contains("m"))
			{
				one = Integer.parseInt(value1);
				rslt = Integer.parseInt(result);
				System.out.println(one+" "+"+ "+(rslt-one)+" "+"= "+rslt);
				continue;
			}
		}
	}
}
