package Interview;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SoniQu
{

	public static void main(String[] args) 
	{
		
		String s="india";
		//o/p-->xxxyyxyy
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		for(int i=0;i<s.length();i++)
			
		{
			for(int j=i+1;j<s.length();j++)
				
			{
				String r = s.substring(i,j);
				if(r.length()==2)
				{
					System.out.println(r);
				}
				set.add(r);
				System.out.println(r);
				
				
			}
			//String S="my name is praveen";
			//o/p-->ne evar ps iemanym 
					
		}

		/*
		String s[]={"A:20","C:40","D:10","B:30"};
		//[A:20, B:30, C:40, D:10]
		
		TreeSet<String> set=new TreeSet<String>();
		
		for(int i=0;i<s.length;i++)
			
		{
			set.add(s[i]);
		}
		System.out.println(set);
		*/
	}

}
