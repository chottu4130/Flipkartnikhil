package accesm;

import java.util.Scanner;

public class Array9 
{
	//left rotate the element of the array

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int [] a=new int[sc.nextInt()];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
			
		}
		int temp = a[0];
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
