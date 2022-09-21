package accesm;
import java.util.Scanner;
public class Pr12 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int num=a+1;
		boolean flag=false;
		for(int num1=1;num1<=num/2;num1++)
		{
			if (num1*num1==num)
			{
				flag=true;
				break;
			}
			
		}
		if(flag)
		{
			System.out.println("sunny number ");
		}
		else
		{
			System.out.println("not sunny number");
		}
	}

}
