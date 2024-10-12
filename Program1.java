class Demo
{
	private static int x;
	static void f1()
	{
		x=5;
		System.out.println(x);
	}
}
class Program1
{
	public static void main(String[] args)
	{
		Demo.f1();
		
	}
}