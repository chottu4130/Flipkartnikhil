package Interview;

import java.util.LinkedHashSet;

public class NoOfOccurenceofEachCharInRevOrder
{

	public static void main(String[] args) 
	{
		String s="testEnginer";
		s=s.toLowerCase();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=s.length()-1;i>=0;i--)
			
		{
			set.add(s.charAt(i));
		}
		
		for (Character ch : set)
		{
			for(int i=s.length()-1;i>=0;i--)

			{
				if(ch==s.charAt(i))
					
				{
					System.out.println(ch+"="+(i+1));
					break;
				}
			}
		}
	}

}
