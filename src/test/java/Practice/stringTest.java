package Practice;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

public class stringTest 
{

	public static void main(String[] args) 
	{
		
		String s="122hsh@#";
		String ch="";
		String num="";
		String spa="";
		
		for(int i=0;i<s.length();i++) 
		{
			if(s.charAt(i)>='a'&& s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z')
			{
				ch=ch+s.charAt(i);
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num=num+s.charAt(i);
			}
			else
			{
				spa=spa+s.charAt(i);
			}
			
		}
		System.out.println(ch);
		System.out.println(num);
		System.out.println(spa);

	}

}
