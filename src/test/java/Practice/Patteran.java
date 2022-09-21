package Practice;

public class Patteran 
{

	public static void main(String[] args) 
	{
		/*
		 *      1
		 *     121
		 *     12321 
		 */
		 
			  for(int i=1;i<=4 ;i++)
			   {
		      for(int j=i;j<=4;j++)
		      {
		        System.out.print(" ");
		      }
		      for(int j=1;j<=i;j++)
		      {
		        System.out.print(j);
		      }
		      for(int j=i-1;j>=1;j--)
		      {
		        System.out.print(j);
		      }
		      System.out.println();
		    }
		    
		
		/**
		 * 			*
		 * 		  *   *
		 * 	   	  *  *  *	
		 * 
		 */
		/*
	    	for(int i=1;i<=4 ;i++)
		   {
	      for(int j=i;j<=4;j++)
	      {
	    	  System.out.print(" ");
	      }
	      for(int j=1;j<i;j++)
	      {
	    	  System.out.print(" * ");
		   }
	      System.out.println();
	      }
		
	*/	
	}

}
