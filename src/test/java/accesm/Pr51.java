package accesm;

import java.util.Scanner;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Pr51 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(i%2==1)
				{
					if(j%2==1)
						System.out.print(1);
					else
						System.out.print(0);
				}
				else
				
					if(j%2==1)
					
						System.out.print(0);
					
					else
					
						System.out.print(1);
			}
				}
		System.out.println();
		
		}
	
	
	}


	
	


