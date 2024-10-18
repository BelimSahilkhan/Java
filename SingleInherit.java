class A
{
	protected int a,b;
};
class B extends A
{
	void dis()
	{
		a=10;
		b=20;
		System.out.println(a+b);
	}
};


class SingleInherit
{
	public static void main(String []args)
	{
		B b1=new B();
		b1.dis();
		
	}
}