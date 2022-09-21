package accesm;

import java.util.Scanner;

public class Pr46 {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		int row =sc.nextInt();
		char ch='a';
		for(int i=1;i<=row;i++)
		{
			char c1=ch;
			for(int j=1;j<=i;j++)
			{
				System.out.print(c1++);
			
	
	}
			System.out.println();
			ch++;
	}
	}
}


