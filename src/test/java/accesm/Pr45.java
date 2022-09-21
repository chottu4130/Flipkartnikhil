package accesm;

import java.util.Scanner;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Pr45 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int row =sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			char ch='a';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch++);
		}
		
		System.out.println();
		
	}
	}
}
