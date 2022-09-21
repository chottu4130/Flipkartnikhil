package accesm;

import java.util.Scanner;
//duplicate character in String
public class String14 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	
	char[] c=s.toCharArray();
	int[] freq=new int[c.length];
	for(int i=0;i<c.length;i++)
	{
		freq[i]=1;
		for(int j=i+1;j<c.length;j++)
		{
			if(c[i]==c[j] && c[j]!='0');
			{
				freq[i]++;
				c[j]='0';
			}
		}
	}
	for(int i=0;i<c.length;i++)
	{
		if(freq[i]> 1 && c[i]!='0' && c[i]!=' ')
		{
		System.out.println(c[i]);	
		}
	}
	
	
	
		 }
}




