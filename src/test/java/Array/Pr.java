package Array;

public class Pr 
{

	public static void main(String[] args) 
	{
		String s="hii45byee@#$";
		String alphabet="";
		String	num="";
		String	special="";

	    	for(int i=0;i<s.length();i++) 
	    	{
			if(s.charAt(i)>='a'&& s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z') 
			{
				alphabet=alphabet+s.charAt(i);
				
			}
			else if (s.charAt(i)>='0'&& s.charAt(i)<='9') 
			{
				num=num+s.charAt(i);
				
			}
			else
			{
				special=special+s.charAt(i);
			}
	}
		System.out.println(alphabet);
		System.out.println(num);
		System.out.println(special);

	}
}
