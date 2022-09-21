package Interview;

public class Pattr 
{

	public static void main(String[] args) 
	{
		/*
	int a=15;
	int b=20;
		System.out.println(a+b+"java");
		*/
		for(int i=1;i<=5;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
			
			else
			{
				int x=0;
				while(x<i)
				{
					System.out.print(i);
					x++;
					
				}
				
				System.out.println("");
			}
			
			
		}
		
		
	}

}
