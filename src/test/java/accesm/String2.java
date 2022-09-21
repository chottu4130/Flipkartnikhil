package accesm;

import java.util.Scanner;

public class String2
{
//count the number of words in the String
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
	if((i==0 && s.charAt(i)!=' ')||( s.charAt(i)!=' '&& s.charAt(i-1)==' '))
					count++;
		}
		System.out.println("no of words in the String "+ count);
			

	}

}
