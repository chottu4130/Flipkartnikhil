package Interview;

public class ReverseTheStringUsing3rdVarable {

	public static void main(String[] args) 
	{
		String s="india";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			//i=5-1=4 4>=0 3>=0 2>=0 1>=0 0>=0  -1>0
			rev=rev+s.charAt(i);//""+a,a+i,ai+d,aid+n,aidn+i
			//System.out.print(s.charAt(i));
			
		}
		System.out.print(rev);

	}

}
