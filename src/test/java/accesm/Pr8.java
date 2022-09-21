package accesm;
import java.util.Scanner;
public class Pr8
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the value of x ");
		int x=sc.nextInt();
		System.out.println("Enter the value of y");
		int y=sc.nextInt();
	
		int pro=1;
		for(int i=1;i<=y;i++)
		{
			pro=pro*x;
		}
		System.out.println(pro);
		
	}

}

