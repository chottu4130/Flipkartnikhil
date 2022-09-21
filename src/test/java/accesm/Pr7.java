package accesm;
import java.util.Scanner;
public class Pr7 
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		
boolean flag= false;
for(int i=1;i<=a/2;i++)
{
	if(i*i==a)
	{
		flag=true;
		break;
	}
}
	if(flag)
	System.out.println("Perfact number");
	else
		System.out.println("Not perfact number");
	}

}
