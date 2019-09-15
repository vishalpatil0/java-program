import java.io.*;
class Employee implements Serializable
{
	private int eid;
	private String ename;
	private double esal;

	public Employee(int eid,String ename,double esal)
	{
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
	}	
	public void display()
	{
		System.out.println("Emp id :"+eid);
		System.out.println("Emp Name :"+ename);
		System.out.println("Emp Sal :"+esal);
	}
}
class TestSerialization
{
	public static void main(String args[])
	{
Employee e1=new Employee(101,"Ramesh",10000);


//Store object in to file is called serialization
	try
	{
	FileOutputStream fout=new FileOutputStream("E:\\emp.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fout);
	oos.writeObject(e1);
	System.out.println("Object Save in file..");
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
//Read object from file...Deserialization
	try
	{
	FileInputStream fin=new FileInputStream("E:\\emp.txt");
	ObjectInputStream ois=new ObjectInputStream(fin);
	Employee e=(Employee)ois.readObject();
	e.display();
	
	}
	catch(Exception e)
	{
	}	
		
	}
}