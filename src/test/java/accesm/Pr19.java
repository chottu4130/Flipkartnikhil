package accesm;
import java.util.Scanner;
public class Pr19 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the starting number");
	int m=sc.nextInt();
	System.out.println("Enter the ending number");
	int n=sc.nextInt();
	
	int sum=0;
	for(int i=m;i<n;i++)
	{
		int fact=1;
		while(fact>0)
		{
			int temp=i;
			int last=fact%10;
			while(last>0)
			{
				fact=fact*last;
				last--;
			}
			sum=sum+fact;
			temp/=10;
		}
		if(sum==i)
		{
			System.out.println(i);
		}
	}
	}
       //Strong number b/n m to n
}