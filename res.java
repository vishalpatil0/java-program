import java.util.*;
import static java.lang.System.out;
class student
{
	private int roll_no;
	protected String name;
	void accept(int x,String a)
	{
		roll_no=x;
		name=a;
	}
	void display()
	{
		accept(97,"Vishal");
		out.println("roll_no is:"+roll_no);
	}
}
	class marks extends student
	{
       int marks[]={66,88,84};
       int ans=0;
        protected void cal()
		{
           for(int i=0;i<3;i++)
		   {
                ans=ans+marks[i];
		   }
          double per=ans/3;
          out.println("name is:"+name);		  
	       out.println("percentage  is:"+per);
		}
	}
	class display extends marks
	{
		void dis()
		{
			display();
			cal();
		}
	}
	class res
	{
		public static void main(String args[])
		{
			display d=new display();
			d.dis();
		}
	}