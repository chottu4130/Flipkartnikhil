package accesm;
import java.util.Scanner;
public class Year 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int yea =sc.nextInt();
		if((yea%4==0) && (yea%400==0||yea%100!=0))
		{
			System.out.println("le year");
		}
		else
		{
			System.out.println("not le yer");
		}
	}

}
