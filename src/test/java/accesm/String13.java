package accesm;

import java.util.Scanner;
//convert lower case to  caae 
public class String13 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				int X=(int)s.charAt(i);
				char c=(char)(X-32);
				s2=s2+c;
			}
			else
			{
				s2=s2+s.charAt(i);
			}
		}
		System.out.println(s2);

	}

}
