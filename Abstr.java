abstract class Demo1
{
	int x,y;
	void f1()
	{
		x=56;
		y=4;

	}
	abstract void f2();
	Demo1()
	{
		System.out.println("Parent's Constructor");

	}
}
class Demo2 extends Demo1
{
	int z;
	void f3()
	{
		z=6;

	}
	void f2()
	{

	}
	Demo2()
	{
		System.out.println("Child's Constructor");
	}
}
class Abstr
{
	 public static void main(String[] args)
	{
		Demo2 d1=new Demo2();
		
	}
}