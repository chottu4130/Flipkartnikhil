package accesm;
import java.util.Scanner;
public class Pr4 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int a =sc.nextInt();
		int sum=0;
		int prod=0;
		while(a>0)
		
		{
			int last =a%10;
			sum=sum+last;
			prod =prod*last;
			a/=10;
		}
	

		if(sum==prod)
		{
			System.out.println("spy number");
		}
		else
		{
			System.out.println("not spy number");
		}

}
	
}