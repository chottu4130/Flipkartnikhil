package accesm;

import java.util.Arrays;
import java.util.Scanner;

public class String9 
{
//program to determine whether two String are anagram e.g=> cat=act;||study=dusty
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean result =Arrays.equals(c1, c2);
		if(result)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
			
		

	}

}
