package accesm;


public class Pr26 
{

	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==2&&j==2)
					System.out.print("@");
				else if(i==5&&j==4)
					System.out.print("!");
				else
					System.out.print("*");
			}
			System.out.println();
		}

	}

}
