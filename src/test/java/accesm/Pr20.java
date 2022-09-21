package accesm;
import java.util.Scanner;
public class Pr20
{//Armstrong number b/n m to n

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting number");
		int m=sc.nextInt();
		System.out.println("Enter the ending number");
		int n=sc.nextInt();	
		for(int i=m+1;i<=n;i++)
		{
			int temp1=i;
			int temp2=temp1;
			int count=0;
			while(temp1>0)
			{
				temp1/=10;
				count++;
			}
			int sum=0;
			while(temp2>0)
			{
				int last=temp2%10;
				int pro=1;
				for(int j=1;j<=count;j++)
				{
					pro=pro*last;
				}
				sum=sum+pro;
				temp2/=10;
			}
			if(sum==i)
			{
				System.out.println(i);
			}
			
		}
	}

}
