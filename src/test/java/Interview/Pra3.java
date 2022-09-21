package Interview;

public class Pra3 
{

	public static void main(String[] args) 
	{
		String s="my name is nikhil raj";
		
		String str[]=s.split(" ");
		
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.print(str[i]+" ");
			
		}
		
		/*
		for(String wo:str)
			
		{
			for(int i=wo.length()-1;i>=0;i--)
			{
				System.out.print(wo.charAt(i));
			}
			System.out.print(" ");
		}
		*/
		
		
		
	}

}
