package accesm;
import java.util.Scanner;
public class Pr11 
{
public static void main(String[] args)
{ 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int a=sc.nextInt();
	int fact=1;
	int sum=0;
	while(a<0) 
	{ 
		fact=fact*a;
		a--;
		
	}
	sum=a+fact;
	if(sum==a)
	{
		System.out.println("Strong number");
	}
	else
	{
		System.out.println("not Strong number");
	}
}
}
//Strong nu

