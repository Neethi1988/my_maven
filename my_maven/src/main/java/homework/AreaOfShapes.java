package homework;

public class AreaOfShapes {
	//method overloading example
	int a,b,d;
	float g,h;
	public void area(int a, int b)
	{
		this.a=a;
		this.b=b;
		int c=a*b;
		System.out.println("Area of a rectangle is " + c);
	}
	public void area(int d)
	{
		this.d =d;
		int e= d*d;
		System.out.println("Area of a square is " + e);
		
	}
	public void area(float g, float h)
	{
		this.g= g;
		this.h=h;
		float i= 3.14f* g* h;
		System.out.println("Area of a circle is " + i);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AreaOfShapes obj1=new AreaOfShapes();
        obj1.area(2f,3f);
        
	}

}
