package Practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Readertext 
{
	@Test
	public void text() throws IOException
	{
		FileReader f=new FileReader("./src/test/resources/TextFile.txt");
		BufferedReader br=new BufferedReader(f);
		
		 String st;
	        while ((st = br.readLine()) != null)
	 
	            System.out.println(st);
	}
	
	
	@Test
	public void texttt() throws FileNotFoundException
	
	{
		File file1 = new File("./src/test/resources/TextFile.txt");
        Scanner sc = new Scanner(file1);
      	     
        while (sc.hasNextLine()) 
        {
          System.out.println(sc.nextLine());
	}
	}
}
