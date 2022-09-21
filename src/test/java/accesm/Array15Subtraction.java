package accesm;

import java.util.Scanner;

public class Array15Subtraction {
//Subtraction of two matrix
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		 int [][] a=new int [3][3];
		 int [][] b=new int [3][3];
		 System.out.println("enter the values for 1st matrix");
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=0;j<a[i].length;j++)
			 {
				 a[i][j]=sc.nextInt();
			 }
		 }
		 System.out.println("enter the values for 2nd matrix");
		 for(int i=0;i<b.length;i++)
		 {
			 for(int j=0;j<b[0].length;j++)
			 {
				 b[i][j]=sc.nextInt();
			 }
		 }
		 
		 subMatrix(a,b);
		 
	}

	public static void subMatrix(int[][]a,int[][]b)
	{
		int[][] c=new int[a.length][a[0].length];
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[0].length;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
				
			}
	}
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[0].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
