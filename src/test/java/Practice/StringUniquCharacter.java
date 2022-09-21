package Practice;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class StringUniquCharacter 
{

	public static void main(String[] args) 
	{
		/*
		String a="my name is raj";
		String b="my name is nikhil";
	
		String s=a+" "+b;
		
		String []str=s.split(" ");
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		for (String st: set) 
		{
			int count=0;
			
			for(int i=0;i<str.length;i++)
			{
				if(st.equals(str[i]))
					
				{
					count++;
					
				}
				
				
			}
			
			if(count==1)
			{
			 System.out.println(st);
			}
		}
		
		
		
		*/
		
		
		String s1="the movie name is abc and the duration is 2.30 aaa";
		String s2="the movie name is defg hh and the duration is 2.10 bbb";
		String s3="the movie name is and the duration is 2.20 ccc";
		
		String []s11=s1.split(" ");
		String []s22=s2.split(" ");
		String []s33=s3.split(" ");
		
		TreeSet<String> str=new TreeSet<String>();
				str.add(s11[9]);
				str.add(s22[10]);
				str.add(s33[8]);
				for (String s : str) 
				{
					System.out.println(s);
					break;
					
				}
		
		
		
	}

}
