class Wrap
{
	public static void main(String[]args)
	{
		int x=Integer.parseInt("123");
		System.out.println(x);
		
		Integer il=Integer.valueOf("1000011",2);
		int z=il.intValue();
		System.out.println(z);

		Double x1=Double.valueOf("56");
		double y=x1.doubleValue();
		System.out.println(y);
	}
}