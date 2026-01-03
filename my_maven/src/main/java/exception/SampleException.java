package exception;

public class SampleException {
	int a;
	int b=10;
	public void add()
	{
		try
		{
		System.out.println(b/a);
		}
		catch(Exception e1)
		{
		System.out.println("Exception handle");	
		System.out.println(e1);
		}
		finally
		{
			System.out.println("Finally block");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SampleException obj1= new SampleException();
		System.out.println("Before Exception");
		obj1.add();
		System.out.println("After Exception");

	}

}
