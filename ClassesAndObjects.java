class Nokia
{
	private int mic;
	private int cam;
	void setValue()
	{
		mic=2;
		cam=20;
	}
	void display()
	{
		System.out.println(mic);
		System.out.println(cam);
	}
}

class ClassesAndObjects
{
	public static void main(String []args)
	{
		Nokia n1=new Nokia();
		n1.display();
		n1.setValue();
		n1.display();
	}
}
