package Array;

public class ArrayString 
{

	public static void main(String[] args) 
	{
		String[] s= {"a","ab","abcde","abc","abcd"};
		
		for(int i=0;i<s.length;i++)
			
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].length()>s[j].length())
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
					
					
				}
				
			}
			System.out.println(s[i]);
		}
		

	}

}
