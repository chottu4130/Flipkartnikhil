package accesm;

import java.util.Scanner;

public class Array4 {
//odd position
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int []a=new int[5];
		int []b=new int[a.length];
		
		for(int i=0;i<a.length;i++)//Initilization
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<b.length;i++)//coping the elements
		{
			b[i]=a[i];
			
		}
		for(int i=0;i<b.length;i++)//reinitilazing the elements
			if(i%2==0)
			System.out.println(a[i]);
	}

}
