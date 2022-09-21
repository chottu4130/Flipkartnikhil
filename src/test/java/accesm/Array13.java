package accesm;

import java.util.Scanner;

public class Array13 
{
//collam wies lest element 
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
			 int temp=a[0][i];
			 for(int j=1;j>a[0].length;j++)
			 {
				 if(temp>a[j][i])
					 temp=a[j][i];
			 }
			 System.out.println("the least element in rhe "+(i+1)+"is "+temp);
		 }

	}

}
