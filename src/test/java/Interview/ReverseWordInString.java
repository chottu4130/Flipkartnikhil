package Interview;

public class ReverseWordInString {

	public static void main(String[] args) 
	{
		
		String s="wellcom to tyss";
		
		String str[]=s.split(" ");
		for(String wo :str)
			
		{
			for(int i=wo.length()-1;i>=0;i--)
				
			{
				System.out.print(wo.charAt(i));
			}
			
			System.out.print(" ");
		}

	}

}
