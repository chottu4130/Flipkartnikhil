package accesm;

import java.util.Scanner;
//to print smallest and biggest possible palindrome word in the given String eg: Wow that madam knowns MALAYALAM
//to lower case
//split then convert into Array

public class String17
{
	public static boolean isPalindrime(String s)
	{
	boolean flag=true;
	for(int i=0;i<s.length()/2;i++)
	{
		if(s.charAt(i)!=(s.length()-1-i))
			flag= false;
	}
	
	return flag;
	}
	public static void main(String[] args)			
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		s1=s1.toLowerCase();
		String [] s2=s1.split(" ");
		int count =0;
		String small_pal=s2[0];
		String large_pal =s2[0];
		int small=s2[0].length();
		int large =s2[0].length();
		
		for(int i=0;i<s2.length;i++)
		{
			if(isPalindrime(s2[i]))
			{
				count++;
				if(count==1)
				{
					small_pal=s2[0];
					large_pal=s2[0];
				}
				else
				{
					if(small>s2[i].length())
					{
						small_pal=s2[i];
					}
					if(large <s2[i].length())
					{
						large_pal=s2[i];
					}
				}
				
			}
		}
		if(count==0)
			System.out.println("no pal");
		else
		{
			System.out.println("biggest palindrom is "+ large);
			System.out.println("smallest palindrome is "+small);
		}
		


	}

}
