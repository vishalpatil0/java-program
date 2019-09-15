import java.util.*;
import java.io.*;
class invalidAgeException extends Exception
{
	int age;
	public invalidAgeException(int age)
	{
		this.age=age;
	}
	public String toString()
	{
		return("exception:"+age+"<18");
	}
}
class exception_throws
{
	public static void display(int rno,String name,int age) 
	throws invalidAgeException
	{
	if(age<18)
	{
		throw new invalidAgeException(age);
	}
	System.out.println("welcome");
	}
	public static void main(String args) throws invalidAgeException
	{
	
		int rno=97;
		String name="vishal patil";
		int age=18;
		display(rno,name,age);
		System.out.println("thank u press any key to exit");
	}
}