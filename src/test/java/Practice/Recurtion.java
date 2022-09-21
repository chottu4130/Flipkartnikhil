package Practice;

public class Recurtion 
{
	static int i=123;
	static int sum=0;
	public static void recutions()
	{
		
		
	    if(i>0)
	    {
	    	int last=i%10;
		    sum=(sum*10)+last;
		    i=i/10;
		    recutions();
		    
	    }
	   
	    		
	}

	public static void main(String[] args)
	{
		recutions();
		System.out.println(sum);


	}

}
