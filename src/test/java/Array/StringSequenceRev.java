package Array;

public class StringSequenceRev 

{

	public static void main(String[] args) 
	{
		String s="welcome to tyss too";
		
		String[] str=s.split(" ");
		
		for(int i=str.length-1;i>=0;i--)
			
		{
			System.out.print(str[i]+" " );
		}
		 
		
		
	}

}
