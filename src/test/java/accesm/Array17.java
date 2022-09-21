package accesm;

import java.util.Scanner;

public class Array17 {

	public static void main(String[] args) 
	{
		//transpose of a matrix
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
				
		 int [][] a=new int [row][col];
		 int [][] b=new int [a.length][a[0].length];
		 //int[][] b=new int[a[0].length][a.iength]; for diff row and diff col
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
				b[i][j]=a[j][i];
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
