package Array;

public class SplitAndGeCombination 
{

	public static void main(String[] args)
	{
		String s="abc";
		s=s+"xyz";
		
		//a b c x y z
		//0 1 2 3 4 5
		//o/p=axbycz
		
		int n=s.length()/2;
		for(int i=0;i<n;i++)
			
		{
			System.out.print(s.charAt(i)+""+s.charAt(i+n));
		}
		
		
	}

}
