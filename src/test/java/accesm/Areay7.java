package accesm;

import java.util.Scanner;

public class Areay7 
{//largest element in the array
	//smallest number use >

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		
		
		
		int temp=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(temp<a[i])
				temp=a[i];
		}
		
		System.out.println(temp);
	}

}
