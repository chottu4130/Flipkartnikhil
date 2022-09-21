package accesm;

import java.util.Scanner;

public class Pr37 
{

	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter no of row");
		 int row =sc.nextInt();
		// int col=(row*2)-1;
		// int mid=(col/2)+1;
		 for(int i=1;i<=row;i++)		//another way to solve
			
		 {
			 for(int j=1;j<=(row-i);j++)//to print space
			 {
				 System.out.print(" ");
			 }	
			 for(int j=1;j<=(i*2)-1;j++)//to print *
			 {
				 System.out.print("*");
			 }
			 
			 System.out.println();
	}
	}
}
