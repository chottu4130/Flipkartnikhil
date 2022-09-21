package accesm;

import java.util.Scanner;

public class Pr47 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int row =sc.nextInt();
		char ch='a';
		
		for(int i=1;i<=row;i++)
		{
			char c1=ch;
			int num=1;
			for(int j=1;j<=i;j++)
			{
				if(i%2==1)
					System.out.print(num++);
				else
					
				System.out.print(c1++);
			
	
	}
			System.out.println();
			
	}

	}

}
