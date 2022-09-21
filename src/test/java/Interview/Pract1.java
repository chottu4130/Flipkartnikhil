package Interview;

import java.util.LinkedHashSet;

public class Pract1 
{

	public static void main(String[] args) 
	{
		/*
		 reverse
		int a=211;
		
		while(a>0)
			
		{
			int last=a%10;
			
			System.out.print(last);
			
			a=a/10;
			
		}
		
		*/
		/*
		 * sum of digit
		int a=12364;
		int sum=0;
		while(a>0)
			
		{
			int last=a%10;
			a=a/10;
			sum=sum+last;
				
		}
		System.out.println(sum);
		*/
		/*
		int a=3254;
		int rev=0;
		while(a>0)
			
		{
			int last=a%10;
			rev=(rev*10)+last;
			a=a/10;
		}
		System.out.println(rev);
		*/
		/*
		 * prime no
		 * 
		int a=1;
		int b=100;
		
		for(int i=a;i<=b;i++)
		{
			int count=0;
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
					
				{
					count++;
				}
				if(count==1)
				{
					System.out.print(i);
				}
			}
			*/
		/*
		int a=231;
		int count=0;
		for(int i=2;i<=a;i++)
			
		{
			if(a%i==0)
				
			{
				count++;
			}
			if(count==1)
				
			{
				System.out.println("not primr");
			}
			else
			{
				System.out.println("prime");
			}
		}
		*/
		/*
		 * factorial of num
		int a=5;
		int fact=1;
		while(a>0)
		{
			fact=fact*a;
			a--;	
		}
		System.out.println(fact);
		*/
		/*
		 * fibonnaci series 
		int a=0;
		int b=1;
		for(int i=3;i<=9;i++)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		*/	
		/*
		 * reverse character
		String s="nikhil";
		for(int i=s.length()-1;i>=0;i--)
			
		{
			System.out.print(s.charAt(i));
		
		}
		*/
	/*	
		String s="my name is nikhil raj";
		String str[]=s.split(" ");
		for(String wo:str)
		{
			for(int i=wo.length()-1;i>=0;i--) 
			{
			System.out.print(wo.charAt(i));
		}
			System.out.print(" ");
		}
		*/
		/*
		 * a3b3c2d1a1b1
		String s="aaabbbccdab";
		for (int i = 0; i < s.length(); i++) 
		{
			int count=1;
			for (int j = i+1; j < s.length(); j++)
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
		 * o/p-->morning good
		String s1="good";
		String s2="morning";
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println(s1);
		System.out.println(s2);
		*/
		/*
		 * n1i2k1h1l1
		 * 
		String s="nikhil";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
			
		{
			set.add(s.charAt(i));
		}
		
		for (Character ch : set) 
		{
			int count=0;
			for (int i = 0; i < s.length(); i++) 
			{
				if(ch==s.charAt(i))
					
				{
					count++;
				}
			}
			System.out.print(ch+""+count);	
			
		}
		
		*/
		/*
		String s1="xyz";
		String s2="abc";
		
		StringBuffer str= new StringBuffer(s1);
		System.out.println(s1==s2);
		System.out.println(s1.equals(str));
		System.out.println(s1.equals(s2));
		*/
		/*
		 String s="hello how are you";
	     String str[]=s.split(" ");
	     
	     LinkedHashSet<String> st=new LinkedHashSet<String>();
	     */
	     
		
		
		
		
		}
		
}
