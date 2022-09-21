package Interview;

public class PrintOccurencrOfCharacter 
{

	public static void main(String[] args) 
	{
		String s="a2b3c4d9";
			//	  012345
		for (int i = 0; i < s.length()-1;i-- ) 
		{//i=0 0<5 ,i=2 i=4 4<5 6<5
			int n=s.charAt(i+1)-48;//50-48=2,51-48=3,52-48=4
			
			while(n>0) // 2>0 1>0 0>0 3>0 2>0 1>0 0>0  
			{
				System.out.print(s.charAt(i)); //aabbbcccc
				//1 0 2 1 0 3 2 1 0
			}
			i=i+2; //2,4,6
		}
	
	
	
	}

}
