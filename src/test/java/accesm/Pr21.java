package accesm;
import java.util.Scanner;
public class Pr21
{
//Sunny number b/n m to n;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting number");
		int m=sc.nextInt();
		System.out.println("Enter the ending number");
		int n=sc.nextInt();	
		for(int i=m;i<n;i++)
		{
			int num=i+1;
			boolean flag=false;
			for(int j=1;j<=num;j++)
			{
				int squ=j*j;
				if(squ==num)
				{
					flag=true;
					break;
				}
				
			}
			if(flag)
			{
				System.out.println(i);
			}
		}
	}

}
