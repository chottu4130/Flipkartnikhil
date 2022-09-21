package accesm;

import java.util.Scanner;

public class String11 
{
//sum of number in an alpha numeric String
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='1'&& s.charAt(i)<='9')
			{
				sum+=Character.getNumericValue(s.charAt(i));
			}
		}
		System.out.println(sum);

	}

}
