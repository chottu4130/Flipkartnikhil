package Interview;

public class ReverseTheStringWithoutUsingLengthVarable 
{

	public static void main(String[] args)
	{
		String s="india";
		
		String rev="";
		/*
		int count=0;
		char[] str = s.toCharArray();
		
		for(char c :str)
		{
			count++;
		}
		System.out.println(count);
		
		for(int i=count-1;i>=0;i--)
		{
			
			rev=rev+s.charAt(i);//""+a,a+i,ai+d,aid+n,aidn+i
			
		}
		System.out.print(rev);
		
		*/
		int count=s.compareTo(rev);
		for(int i=count-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
	}

}
