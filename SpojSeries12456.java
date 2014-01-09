import java.util.*;


public class SpojSeries12456 
{
	static List<Long> list = new ArrayList<Long>();
	
	public static void main(String args[])
	{
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		
		list.add((long) 1);
		list.add((long) 2);
		list.add((long) 3);
		list.add((long) 4);
		
		for(int i=4;i<100;i++)
		{
			Long next = list.get(i-1) + list.get(i-3);
			list.add(next);
			System.out.println(next);
		}
	}
}
