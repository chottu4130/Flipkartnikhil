package accesm;

import java.util.Scanner;

public class Aray18 {
//rotate the matrix 90 degree left or right
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
				
		 int [][] a=new int [row][col];
		 int [][] b=new int [a[0].length][a.length];
		 for(int i=0;i<a.length;i++)//initialize the element
			{
				for(int j=0;j<a[i].length;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
		 for(int i=0;i<b.length;i++)//copying the matrix element
			{
				for(int j=0;j<b[0].length;j++)
				{
					b[i][j]=a[a.length-1-j][i];
				}
			}
		 for(int i=0;i<b.length;i++)//printing the element
		 {
			 for(int j=0;j<b[0].length;j++)
			 {
				 System.out.print(b[i][j]+" ");
			 }
			 System.out.println();
		 }

	}

}
