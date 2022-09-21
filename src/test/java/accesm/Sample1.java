package accesm;

public interface Sample1
{
void m1();
void m2();

}
interface TestSample extends Sample1
{
	void m3();
	void m4();
	
}
class MySample implements TestSample
{

	@Override
	public void m1()
	{
		
		System.out.println("m1 is in Mysample class");
	}

	@Override
	public void m2() 
	{
		
		System.out.println("m2 is in Mysample class");
	}

	@Override
	public void m3()
	{
		
		System.out.println("m3 is in Mysample class");
	}

	@Override
	public void m4() 
	{
		System.out.println("m4 is in Mysample class");	
	}
	
}
	
