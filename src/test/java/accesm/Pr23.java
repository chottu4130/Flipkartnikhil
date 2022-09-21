package accesm;
import java.util.Scanner;
public class Pr23 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of row");
		int row=sc.nextInt();
		System.out.println("Enret the value of col");
		int col=sc.nextInt();
		for(int i=1;i<=col;i++)		
		{
			for(int j=row;j>=i;j--)
			{							//if((i+j)<=6)
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
