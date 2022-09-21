package accesm;

import java.util.Scanner;

public class Pr24
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of row");
		int row=sc.nextInt();
		System.out.println("Enret the value of col");
		int col=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				if(i>j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
		System.out.println();
		}

	}

}