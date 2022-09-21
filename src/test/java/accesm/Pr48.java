package accesm;

import java.util.Scanner;

public class Pr48 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char c='a';
		int num=1;
		int row=sc.nextInt();
		 for(int i=1;i<=row;i++)
			 
		 {
			 for(int j=1;j<=i;j++)
				
			 {
				 
				 if(j%2==1)
					 System.out.print(c++);
				 else
					 System.out.print(num++);
			 }
			 System.out.println();
		 }
	}

}
