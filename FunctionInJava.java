class FunctionInJava
{
	
	static void zx(int x) //parametric method
    {
			System.out.println("This is method is define using static keyword so there is no need to create object to call this method");
        	System.out.println("Passed value is "+x);
	}
	void simple()
	{
		System.out.println("\nThis method is called using object of class bcoz it is not defined using static keyword");
	}
	void simple(char k)
	{
		System.out.println("Passed argument is "+k);
	}
	char simple(float k)
	{
		return 'k';
	}
	byte simple(int a,int b)
	{
		return (byte)(a+b);
	}
    public static void main(String args[])
	{

			 FunctionInJava fnj=new FunctionInJava();
			fnj.simple();
			fnj.zx(102);
			fnj.simple('k');
			System.out.println("Passed float and recieved char"+fnj.simple(2.3f));
			System.out.println("Passed int and int , recieved byte = "+fnj.simple(12,345));
	}
}	