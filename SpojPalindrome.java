import java.io.IOException;
import java.util.Scanner;

public class SpojPalindrome 
{
	public static void main(String args[]) throws IOException
	{
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		try
		{
			for(int i=0;i<cases;i++)
			{
				String num = input.nextLine();
				StringBuilder s = new StringBuilder();
				s.append(num);
				
				for(;;)
				{
					num = num+1;
					
					{
						System.out.println(num);
						break;
					}
				}
			}
		}
		catch(Exception e )
		{
			return;
		}
	}
	
	private static boolean isPalindrome(int number) {
        if(number == reverse(number)){
            return true;
        }
        return false;
    }
  
      
    private static int reverse(int number){
        int reverse = 0;
      
        while(number != 0){
          reverse = reverse*10 + number%10; 
          number = number/10;
        }
              
        return reverse;
    }
}
