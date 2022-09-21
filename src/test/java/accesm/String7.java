package accesm;

import java.util.Scanner;

public class String7
{
//reverse of the String
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1="";
		for(int i=s.length()-1;i>0;i--)
		{
			s1=s1+s.charAt(i);
		}
		System.out.println("reverse if String is "+s1);
	}

}
