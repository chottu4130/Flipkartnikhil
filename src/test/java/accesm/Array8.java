package accesm;

import java.util.Scanner;

public class Array8
{
//3rd largest number
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	int[] a=new int[6];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
		
	}
	int temp;
	for(int i=0;i<a.length;i++)
	{
		
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
		
	}
	System.out.println("3rd largeat is:"+a[(a.length-3)]);

	}

}
