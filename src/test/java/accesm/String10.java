package accesm;

import java.util.Arrays;
import java.util.Scanner;

public class String10
{
//minimum and maximal occurring character in a String   ....frequency
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		
		char[] c =s1.toCharArray();
		int [] freq=new int[c.length];
		for(int i=0;i<c.length;i++)
		{
			freq[i]=1;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j] && c[j]!='0')
				{
					freq[i]++;
					c[j]='0';
				}
			}
		}
		
		char max_char=c[0];
		char min_char=c[0];
		int min=freq[0];
		int max=freq[0];
		for(int i=0;i<c.length;i++)
		{
			if(min>freq[i] && c[i]!='0' && c[i]!=' ')
			{
				min=freq[i];
				min_char=c[i];
			}
			if(max<freq[i] && c[i]!='0' && c[i]!=' ')
			{
				max=freq[i];
				max_char=c[i];
			}
		}
		System.out.println("the mininum occuring char is: "+min_char+"with "+ min +" time");
		System.out.println("the maximum occuring char is: "+max_char+"with " +max +" time");
			

	}

}
