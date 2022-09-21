package Interview;

import java.util.LinkedHashSet;

public class OnluUniquWordinAString 
{
	public static void main(String[] args)
	{
		String s="wellcom to tyss to tyss";
		String[] str = s.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		//if i use LinkedHashSet then the Sequencer of character is followed
		
		for(int i=0;i<str.length;i++)
		{
			
			set.add(str[i]);
		}
		
		//2 Compare each word of set with all char of given String
		for (String word : set) 
		{
			
			int count=0;
			for(int i=0; i<str.length ;i++)
				
			{
				if(word.equals(str[i]))
					
				{
					//3 if word matching increment count
					count++;
				}
			}
			//4 print word and count
			if(count==1)
			System.out.println(word+" "+count);
		}

	}


}
