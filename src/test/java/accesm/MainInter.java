package accesm;

public interface MainInter
{
void m1();
void m2();
void m3();
void m4();
}

class MainInter1 implements MainInter
{

	@Override
	public void m1()
	{
		
		System.out.println("m1 is in mainInter1");
	}

	@Override
	public void m2() 
	{
		System.out.println("m2 is in mainInter1");
		
	}

	@Override
	public void m3() 
	{
		System.out.println("m3 is in mainInter1");
		
	}

	@Override
	public void m4() 
	{
		System.out.println("m4 is in mainInter1");
		
	}
	
}
class MyInterfa implements  MainInter
{

	@Override
	public void m1()
	{
		System.out.println("m1 is in myinterfa");
		
	}

	@Override
	public void m2()
	{
		System.out.println("m2 is in myinterfa");
			
	}

	@Override
	public void m3()
	{
		System.out.println("m3 is in myinterfa");
		
	}

	@Override
	public void m4()
	{
		System.out.println("m4 is in myinterfa");
		
		
	}
	
}