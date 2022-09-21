package accesm;
import java.util.Scanner;
public class Pr9
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int num1=num;
		int orig_num=num;
		int count=0;
	    int sum=0;
		while(num>0)
		{
			
			num/=10;
			count++;		//Armstrong number
		
	}						//123=1^3+2^3+3^3
		while(num1 > 0)		//1453=1^4+4^4+564+3^4
		{
			
			int last=num1%10;
			int pro=1;
			for(int i=1;i<=count;i++)
			{
				pro*=last;
			}
			num1/=10;
			sum+=pro;	
		}
	if(sum==orig_num)	
	System.out.println("armstrong no");
	else
		System.out.println("not armstrong num");
	
	}

}
