package Practice;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class StringArratConstAndVob
{

	public static void main(String[] args) 
	{
		String s[]= {"apple","mango","banana","orange"};
		/**
		 * o/p apple=2;
		 *	   mango=2;
		 *     banana=3
		 *     orange=3
		 * 
		 */
		/*
		  for(int i=0;i<s.length;i++)
		  {
			  int count=0;
			  char[] cha =s[i].toCharArray();
			  for(int j=0;j<cha.length;j++)
			  {
				  if(cha[j]=='a'|| cha[j]=='e'|| cha[j]=='i'|| cha[j]=='o'|| cha[j]=='u')
				  {
					  count++;
				  }
			  }
			  System.out.println(s[i]+" ="+count);
			  
		  }
						
		 */  
		//only vowels in the String
		for(int i=0;i<s.length;i++)
		  {
			  int count=0;
			  String m=s[i];
			  LinkedHashSet<Character> link=new LinkedHashSet<Character>();
			  for (int j = 0; j < m.length(); j++) 
			  {
				link.add(m.charAt(j));
			}
			  for (Character ch : link) 
			  {
				if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
				{
					count++;
				}
			}
			  System.out.println(m+" "+count);
		  }
		

	}

}
