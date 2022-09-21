package accesm;

import java.util.Scanner;

public class Pr36 
{

	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter no of row");
		 int row =sc.nextInt();
		 int col=(row*2)-1;
		 int mid=(col/2)+1;
		 for(int i=1;i<=row;i++)
			
		 {
			 for(int j=1;j<=col;j++)
			 {
				 
				if((j<=(mid-i))||j>=(mid+i))
					System.out.print(" ");
				else
					System.out.print("*");
			 }
			 System.out.println();
		 }

	}

}
