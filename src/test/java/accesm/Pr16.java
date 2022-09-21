package accesm;
import java.util.Scanner;
public class Pr16 
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
		int count=0;
		for(int j=2;j<=i;j++)
		{
			if(i%j==0)
				count++;
		}
	
		if(count==1)
		
			System.out.println(i);
		
		
	}
}
}
