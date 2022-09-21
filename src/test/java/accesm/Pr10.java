package accesm;
import java.util.Scanner;
public class Pr10
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
	
		int a=sc.nextInt();
		int sum=0;
		int b=a*a;
		
		while(b>0)
		{
			int last=b%10;
			sum=sum+last;
			b=b/10;
	
		}
		if(sum==a)
		{
			System.out.println("neon number");
		}
		else
		{
			System.out.println("not neon number");
		}
		}

	}

