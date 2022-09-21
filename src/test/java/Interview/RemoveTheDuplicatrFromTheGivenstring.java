package Interview;

import java.util.LinkedHashSet;

public class RemoveTheDuplicatrFromTheGivenstring
{
	public static void main(String[] args) 
	{
		String s="nikhil";
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		//if i use LinkedHashSet then the Sequencer of character is followed
		
		for(int i=0;i<s.length();i++)
		{//i=0 0<5 1<5 2<5 3<5 4<5 5<5
			
			set.add(s.charAt(i));
		}
		for (Character c : set) 
		{
			System.out.print(c);
		}
	}

}
