import package1.classz;
class classc extends classz
{
	int n=20;
	void displayC()
	{
		System.out.println("class C");
		System.out.println("m="+m);
		System.out.println("n="+n);
	}
}
class packageTest3
{
	public static void main(String args[])
	{
		classc c=new classc();
		c.displayC();
		
	}
}
		 