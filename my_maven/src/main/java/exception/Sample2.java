package exception;

public class Sample2 {
	
	public static void test(int age) throws LicenseException
	{
	if(age<18)
	{
		throw new LicenseException("Ineligible");
	}
	else
	{
		System.out.println("Eligible");
	}
	}
	public static void main(String args[]) throws LicenseException
	{
		Sample2 on=new Sample2();
		on.test(12);
		
		
	}

}
