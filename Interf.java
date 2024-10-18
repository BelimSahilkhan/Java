/*There are three Member By Default=>
								1.static
								2.public
								3.final(final means Fixed)final is also known as iMPLEMENT	
*/
interface i1
{
	int x=6;
	void f1();
		static void f2()
		{
			System.out.println(x);
		}
}
interface i2 extends i1
{
	int x=9;
	int y=2;
	static void f2()
	{
		System.out.println(x);
	}
	void f3();
}
class C1 implements i2
{
	static void f2()
	{
		System.out.println(x);
	}
	public void f1()
	{

	}
	public void f3()
	{

	}
}
class Interf
{
	public static void main(String[] args)
	{
		i2.f2();
		C1 c1=new C1();
		c1.f2();
		System.out.println(c1.y);
		i1.f2();
		
	}
}