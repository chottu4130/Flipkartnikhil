package accesm;

import java.util.Scanner;

public class String15 
{
//duplicate words in String
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String [] s2=s1.split(" ");
		int freq[]=new int[s2.length];
		for(int i=0;i<s2.length;i++)
		{
			freq[i]=1;
			for(int j=i+1;j<s2.length;j++)
			{
				if(s2[i].equals(s2[j]) && s2[j]!="0")
				{
					freq[i]++;
					s2[j]="0";
				}
			}
		}
		for(int i=0;i<s2.length;i++)
		{
			if(freq[i]>1 && s2[i]!="0")
			{
				System.out.println(s2[i]);
			}
				
		}

	}

}
