package accesm;

import java.util.Scanner;

public class Array14reverse {
//reverse the row and column last element
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the values for 1st matrix");
		 int [][] a=new int [3][3];
		
		
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=0;j<a[0].length;j++)
			 {
				 a[i][j]=sc.nextInt();
			 }
		 }
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=a[0].length-1;j>=0;j--)
			 {
				 System.out.print(a[i][j]+" ");
			 }
			 System.out.println();
		 }
	}

}
