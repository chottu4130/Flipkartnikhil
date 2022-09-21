package Practice;

import java.util.Scanner;

import org.testng.annotations.Test;

public class NumberToWordConv 
{
	@Test
	public void noToWord()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number= ");
		int n=sc.nextInt();
		int n1=n;
		int n2=n;
		int n3=n;
		int b=n1%10,a=n2/10,c=a/10;
		String[] single_dig = new String[] {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String[] two_dig = new String[] {"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
		String[] tens_mul=new String[] {"","","twenty","thirty","forty","fifty","sixti","seventy","eighty","ninety"};
		String [] tho_mul =new String[] {"","","","one hundred","two hundred","three hundred","four hundred","five hundred","six hundred","seven hundred","eight hundred","nine hundred"};
		if(a==1)
		{
			System.out.println(two_dig[b+1]);
			
			
		}
		else if(b==0)
		{
			System.out.println(tens_mul[a]);
		}
		else if(c==0||c==1)
		{
			System.out.println(tho_mul[c]+" "+tens_mul[b]+" "+two_dig[a]);
		}
		
		else
		{
			System.out.println(tens_mul[c]+" "+tens_mul[b]+" "+two_dig[a]+" "+single_dig);
		}
		
		
		
		
		
		
		
				
	}

}
