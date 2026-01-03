package homework;

public class AvgOfThreeNum {
	int a, b,c;
	float e,f,g;
	// method overloading example
	public void avg(int a, int b, int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		int d=(a+b+c)/3;
		System.out.println("Average of three numbers " + a +"," + b +" and "+ c + " is " +" "+ d);
				
	}
	public void avg(float e, float f, float g)
	{
		this.e=e;
		this.f=f;
		this.g=g;
		float h=(g+f+e)/3;
		System.out.println("Average of three numbers " + e +","+  f + " and "+ g+ " is " +" "+ h);
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AvgOfThreeNum obj1= new AvgOfThreeNum();
		obj1.avg(2, 3, 13);
		obj1.avg(2.5f, 3.5f, 6.0f);

	}

}
