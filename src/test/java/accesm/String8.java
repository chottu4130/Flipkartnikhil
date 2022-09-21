package accesm;

import java.util.Scanner;

public class String8 
{
//String is palindrome or not
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2="";
		String s3=s1.toLowerCase();
		for(int i=s3.length()-1;i>=0;i--)
		{
			s2+=s3.charAt(i);
		}
		if(s3.equals(s2))
		System.out.println("String is palindrome");
		else
		System.out.println("String is not palindrome");
	}

}
