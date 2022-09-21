package accesm;
import java.util.Scanner;
public class Pr18 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the starting value");
	int m=sc.nextInt();
	System.out.println("Enter the Ending value");
	int n=sc.nextInt();
	for(int i=m+1;i<n;i++)
	{
		int rev=0;
		int temp=i;
		while(temp>0)
		{
			int last=temp%10;
			rev=(rev*10)+last;
			temp/=10;
		}
		if(rev==i)
		{
			System.out.println(i);
		}
		
	}
}
}
