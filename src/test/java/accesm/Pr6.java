package accesm;
import java.util.Scanner;
public class Pr6 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter the number");
	int a=sc.nextInt();
	int fact=1;
	while(a>0)
	{
		fact=fact*a;
		a--;
	}
		
		
		System.out.println(fact);
		
		
		
		
		
	}
}
