package accesm;

import java.util.Scanner;

public class Array5
{
//sort the element of an array in ascending order
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int []a=new int[5];
		int []b=new int[a.length];
		
		
		for(int i=0;i<a.length;i++)
		{
			int temp=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[j];
					a[j]=a[i];
				}	a[j]=temp;
			}
		}
	
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		}
			
	}


