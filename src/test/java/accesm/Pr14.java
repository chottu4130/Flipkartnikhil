package accesm;
import java.util.Scanner;
public class Pr14 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of m");
		int m=sc.nextInt();
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		
		
		for(int i=m;i<=n;i++)
		{
			int temp=i;
			int sum=0;
			for(int j=1;j<=temp/2;j++)
			{
				if(temp%j==0)
				{
					sum=sum+j;
				}
			}
				if(sum==temp)
					System.out.println(i);
			}
			
		}

	}


