package accesm;

public class Pr43 
{

	public static void main(String[] args) 
	{
		int num=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(num++);
				
				 if(num>9)
					num=1;
			}
			System.out.println();
		}
	}

}
