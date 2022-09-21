package accesm;
import java.util.Scanner;
public class Pr15
{

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number");
	int b=sc.nextInt();
	int count=0;
	for(int i=2;i<b;i++)
	{
		if(b%i==0)
			count++;
	}
	if(count>0)
	{
		System.out.println("not Prim no");
	}
	else
	{
		System.out.println("prim no");
	}
	}

}
