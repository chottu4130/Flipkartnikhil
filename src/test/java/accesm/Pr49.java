package accesm;

import java.util.Scanner;

public class Pr49
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int num=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
					System.out.print(num++);
					if(num>5)
				
					num=1;
			}
			System.out.println();
			
		}

	}

}
