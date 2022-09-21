package accesm;

import java.util.Scanner;

public class Array20 {
//display the matrix element in the clockwise spiral order
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		 int [][] a=new int [row][col];
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=0;j<a[0].length;j++ )
			 {
				a[i][j]=sc.nextInt(); 
			 }
		 }
		 int row_start=0;
		 int row_end=a.length;
		 int col_start=0;
		 int col_end=a[0].length;
		while(row_start<=row_end&&col_start<=col_end)
		{
			 for(int i=col_start;i<=col_end;i++)
			 {
				 System.out.print(a[row_start][i]);
			 }
			 row_start+=1;
			 for(int i=row_start;i<=row_end;i++)
			 {
				 System.out.print(a[i][col_end]+" ");
			 }
			 col_end-=1;
			 if(col_start<=col_end)
			 {
				 for(int i=col_end;i>=col_start;i--)
				 {
					 System.out.print(a[row_end][i]+" ");
				 }
				 row_end-=1;
				 if(row_start<=row_end)
				 {
					 for(int i=row_end;i>=row_start;i--)
					 {
						 System.out.print(a[i][col_start]);
					 }
					 col_start+=1;
				 }
				 
							 
			 }
		}

	}

}
















