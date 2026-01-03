package exception;

public class SampleNullPointerExc {
    int a[];
	public void nullP()
	{
		System.out.println(a[6]);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleNullPointerExc obj = new SampleNullPointerExc();
		obj.nullP();

	}

}
