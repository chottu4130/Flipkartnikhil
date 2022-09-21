package Interview;

import java.util.LinkedHashSet;

public class Pract 
{

	public static void main(String[] args) 
	{
		
		String s="my name is nikhil";
		//String rev="";
		
		String[] str = s.split("");
		
		for(int i=str.length-1;i>=0;i--)
			
		{
			System.out.print(str[i]+" ");
		}
		
		/*
		String s="aabbbabc";
		
		for (int i = 0; i <s.length(); i++) 
		{
			int count=1;
			for(int j=i+1;j<s.length();j++)
				
			{
				
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					i++;
					
				}
				else
					
				{
					break;
				}
			
			}
			System.out.print(s.charAt(i)+""+count);
			
			
		}
		*/
		/*
		int a[]= {77,2,3,5,7,9,44};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
				
			{
				if(a[i]<a[j])
					
				{
					int count=a[i];
					a[i]=a[j];
				    a[j]=count;
					
										
				}
				
			}
			
		}
		System.out.println(a[0]);
		
		*/
		/*
		String s="technology";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
			
		{
			set.add(s.charAt(i));
		}
		
		for (Character ch : set) 
		{
			int count=0;
			for(int i=0;i<s.length();i++)
				
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
				
			}
			if(count>1)
			{
			System.out.println(ch);
			}
			
		}
		*/
		/*
		String s="welcom to tyss bangl";
		
		String str[]=s.split(" ");
		String temp=str[0];
		str[0]=str[str.length-1];
		str[str.length-1]=temp;
		
		for (int k = 0; k < str.length; k++) 
		
	{
			String s1=str[k];
			if(k==0|| k==(str.length-1))
				
			{
				for(int h=s1.length()-1;h>=0;h--)
					
				{
					System.out.print(s.charAt(h));
				}
				System.out.print(" ");
			}
			else
			{
				System.out.print(s1+" ");
			}
			
			
		}
		*/
		/*
		int a=1;
		
		while(a<10)
		{
			System.out.println(a);
			a++;
		}
		*/
		/*
		String s="welcom to tyss";
		String str[]=s.split("");
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.print(str[i] +"");
		}
		*/
		/*
		String s="aabbccdcsa";
		
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			for(int j=i+1;j<s.length();j++)
				
				
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					i++;
				}
				else
				{
					break;
				}
			}
			System.out.print(s.charAt(i)+""+count);
		}
		
	*/	
		
	}

}
