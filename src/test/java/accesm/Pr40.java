package accesm;

public class Pr40 
{

	public static void main(String[] args) 
	{
		int num=1;
		char c='A';
		for(int i=1;i<=4;i++)
			
		
		{
			for(int j=1;j<=4;j++)
			{
				if(i%2==1)
					System.out.print(num++ +" ");
				else
					System.out.print(c+++" ");
			}
			System.out.println();
				
		}
	}

}	
