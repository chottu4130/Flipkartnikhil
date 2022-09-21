package accesm;

public class Pr41
{

	public static void main(String[] args) 
	{
		char ch='A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j)
					System.out.print(ch++);
				else if(i==1||j==5||j==1||i==5)
					System.out.print('1');
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
