package Practice;

import java.util.Scanner;

public class Practice2 {
	public static void main(String args[]) {
        String s="aaabbbcccc";
        /*
        int i, length, counter[] = new int[256];
       
        for (i = 0; i < str.length();i++) {
            counter[(int) str.charAt(i)]++;
        }
       for (i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + " --> " + counter[i]);
            }
        }
        */
        for(int i=0;i<s.length();i++)
        {
        	int count=1;
        	for(int j=i+1;j<s.length();j++)
        		
        	{
        		if(s.charAt(i)==s.charAt(j))
        		{
        			count++;
        			i++;
        		}
        	}
        	System.out.print(s.charAt(i)+""+count);
        }
        {
        	
        }
    }
}
