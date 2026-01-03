package exception;

public class ThrowException {
	
	public static void test(int age)
	{
	if(age<18)
	{
		throw new ArithmeticException("Ineligible");
	}
	else
	{
		System.out.println("Eligible");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		try
      {
      ThrowException.test(16);
      }
		catch(Exception e)
		{
			System.out.println("handled");
		}
	}

}
