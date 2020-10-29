class data
{
	
	int a,b;
	data() //Default Constructor
	{
		System.out.println("Object created using Default Constructor");
	}
	data(int x,int y) //Parametric Constructor
	{
		System.out.println("\nObject created using Parametric Constructor");
		a=x;
		b=y;
	}
	data(data obj)  //Copy constructor (Takes the object as paramter and assigned the value of attribute form passed object to new object)
	{
		System.out.println("Object created using Copy/Reference Constructor");
		a=obj.a;
		b=obj.b;
	}
    void show()
	{
		System.out.println("a="+a+"\nb="+b);
	}
}
class AllConstructors
{
	public static void main(String args[])
	{
		data d1=new data();
		data d2=new data(10,20);
		d2.show();
		data d3=new data(d2);
		d3.show();
	}
}	
		

		
		
	