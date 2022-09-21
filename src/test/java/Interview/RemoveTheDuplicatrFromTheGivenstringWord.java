package Interview;

import java.util.LinkedHashSet;

public class RemoveTheDuplicatrFromTheGivenstringWord
{
	public static void main(String[] args)
	{
		String s="wellcom to tyss to";
		String[] str = s.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		//if i use LinkedHashSet then the Sequencer of character is followed
		
		for(int i=0;i<str.length;i++)
		{
			
			set.add(str[i]);
		}
		
		for (String word: set) 
		{
			System.out.print(word+" ");
			
		}
	}

	
}
