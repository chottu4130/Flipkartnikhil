package Practice;

import java.util.LinkedHashSet;

public class CharacterDuplicate 
{

	public static void main(String[] args) 
	{
		Character ch[]= {'a','b','c','d','a','b'};
		LinkedHashSet<Character> li=new LinkedHashSet<Character>();
		for(int i=0;i<ch.length;i++)
		{
			li.add(ch[i]);
		}
		
		for(int i=0;i<ch.length;i++)
		{
			int count=0;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(ch[i]);
			}
		}

	}

}
