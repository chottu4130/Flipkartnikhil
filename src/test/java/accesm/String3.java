package accesm;

import java.util.Scanner;

public class String3 
{
//total number of punctuation characters in the String
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=';'||s.charAt(i)!='@'||s.charAt(i)!='.'||s.charAt(i)!=','||s.charAt(i)!='!')
				count++;
		}
		System.out.println("total number of punctuation characters in the String is "+count);
	}

}
