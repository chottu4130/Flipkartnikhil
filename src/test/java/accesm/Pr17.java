package accesm;
import java.util.Scanner;
public class Pr17
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of m");
		int m=sc.nextInt();
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		for(int i=m;i<n;i++)
		{
			boolean flag=false;
			
			for(int j=1;j<i/2;j++)
			
			{
				int seq=j*j;
				if(seq==1)
				{
					flag=true;
					break;
				}
				
			}
			
			System.out.println(i);
		}//perfact Squ b/n m to n
		 
	}

}
