package interfacepackage;

public class InterfaceSample implements sampleinterface {

	public void add()
	{
		System.out.println("Addition of two numbers");
	}
	
	public void print()
	{
		System.out.println("Print-abstract method1");
	}
	public void display()
	{
		System.out.println("Display-abstract method 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   InterfaceSample obj = new InterfaceSample();
   obj.add();
   obj.print();
   obj.display();
   System.out.println(a);
   System.out.println(obj.b);
   sampleinterface obj2=new InterfaceSample();
   //obj2.add();
	}

}
