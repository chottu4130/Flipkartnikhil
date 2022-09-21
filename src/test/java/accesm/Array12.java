package accesm;

import java.util.Scanner;

public class Array12 
{
//the biggest elrment in the given matrix of each row
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
		int temp=a[i][0];
		 for(int j=0;j<a[0].length;j++)
		 {
			 if(temp<a[i][j])
				 temp=a[i][j];
		 }
		 System.out.println("the biggest elementi the  "+ (i+1) + " "+"is"+temp);
	 }
	}
}
