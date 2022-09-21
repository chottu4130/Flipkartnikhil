package accesm;

import java.util.Scanner;

public class Pr38 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		 int row =sc.nextInt();
		// int col=(row*2)-1;
		// int mid=(col/2)+1;
		 for(int i=row;i>=1;i--)		
			
		 {
			 for(int j=row;j>=i;j--)//to print space
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
