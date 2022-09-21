package accesm;

import java.util.Scanner;

public class Pr42
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		char c='a';
		int num=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
				if(j%2==1)
				{
				System.out.print(num);
				num+=2;
				if(num>9)
					num=1;
				}
				else
				{
					System.out.print(c++);
				}
			System.out.println();
		}
		
	}

}
