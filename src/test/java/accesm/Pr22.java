package accesm;
import java.util.Scanner;
public class Pr22 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of row");
		int row=sc.nextInt();
		System.out.println("Enret the value of col");
		int col=sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(i%2==1)
				{
					if(j%2==1)
					System.out.print("*");
					else
					System.out.print(" ");
				}
					else
						System.out.print(" ");
			}
			System.out.println();
		}
	}
	}

