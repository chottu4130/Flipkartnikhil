package accesm;

import java.util.Scanner;

public class Array10
{
//frequency of each element of an array
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int [] a=new int[sc.nextInt()];
		int [] b=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<a.length;i++)
		{
			int temp=a[i];
			b[i]=1; 
			for(int j=i+1;j<a.length;j++)
			{
				if(temp==a[i]&&temp!=0)
				{
					b[i]++;
					a[i]=0;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				System.out.println(a[i]+"has frequency"+b[i]);
			}
		}
		
		
		
	}

}
