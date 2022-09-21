package accesm;

import java.util.Scanner;

public class Pr39 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row");
		 int row =sc.nextInt();
		 System.out.println("Enter col");
		 int col=sc.nextInt();
		 char c='A';
		 int num=1;
		 for(int i=1;i<=row;i++)
		 {
			 for(int j=1;j<=col;j++)
			 {
				 if(i%2==1)
					 System.out.print(c);
				 else
					 System.out.print(num);
			 }
			 System.out.println();
			 if(i%2==1)
				 c++;
			 else
				 num++;
			
		 }
		

		
			
	}

}
