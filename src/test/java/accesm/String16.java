package accesm;

import java.util.Scanner;

public class String16
{
//find the largest and smallest words in String
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String [] s2=s1.split(" ");
		int freq[]= new int[s2.length];
		
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
		int small = s2[0].length();
		int large = s2[0].length();
		String s3=s2[0];
		String s4 =s2[0];
		for(int i=1;i<s2.length;i++)
		{
			if(small>s2[i].length() && s2[i]!="0")
			{
				small =s2[i].length();
				s3 = s2[i];
			}
			if(large<s2[i].length() && s2[i]!="0")
			{
				large=s2[i].length();
				s3=s2[i];
				
			}
			
		}
		System.out.println("the largest words in String is :"+ s4 +"with largest "+ large);
		System.out.println("the smallest words in String is: "+ s3+"with Smallest"+ small);
		

	}

}
