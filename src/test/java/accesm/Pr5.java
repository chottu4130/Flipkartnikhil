package accesm;
import java.util.Scanner;
public class Pr5
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int sum=0;
		for(int i=1;i<a/2;i++)
		{
			if(a%i==0)
			
			sum=sum+i;	
			break;
		}
			
			if(sum==a)
				
			{
			
				System.out.println(sum);
			}
			
			else
			
			
			
			{
		System.out.println("not perfect number");
		
			}
	
	}

}

