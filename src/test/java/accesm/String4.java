package accesm;

import java.util.Scanner;

public class String4 
{
//the no 
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int vcount=0;
		int ccount=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
					s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
					vcount++;
			
					else
					ccount++;
			
			
					
		}
		System.out.println("the no of vowels is "+vcount);
		
		System.out.println("thr no of consonants is "+ccount);
	}

}
