package Interview;

import java.util.LinkedHashSet;

public class OnlyDuplicateCharactrtInStrinh 
{

	public static void main(String[] args) 
	{
		
		//1. remove duplicate character by creating any set collection add each char of given String to set
		
		
		//2. Compare each character of set with all char of given String
		
		// 3. if char matching increment count
		
		//4. print char and count
		String s="india";
		
		//i=2,n=1,d=1,a=1
		//1 remove duplicate character by creating any set collection add each char of given String to set
		
		//HashSet<Character> set = new HashSet<Character>();
		
		//if i use HasSet then the sequencer  is not followed
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		//if i use LinkedHashSet then the Sequencer of character is followed
		
		for(int i=0;i<s.length();i++)
		{//i=0 0<5 1<5 2<5 3<5 4<5 5<5
			
			set.add(s.charAt(i));
		}
		
		//2 Compare each character of set with all char of given String
		for (Character ch : set) 
		{
			//i==i,i==n,i==d,i==a
			int count=0;
			for(int i=0;i<s.length();i++)
				
			{
				if(ch==s.charAt(i))
					
				{
					//3 if char matching increment count
					count++;
				}
			}
			//4 print char and count
			if(count>1)//only Duplicate character
			System.out.print(ch+""+count);
		}

	}

}
