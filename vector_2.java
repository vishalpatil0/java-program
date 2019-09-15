import java.util.*;
class vector_2
{
	public static void main(String args[])
	{
		Vector list=new Vector();
		list.addElement("vishal");
		int size=list.size();
		String m[]=new String[size];
		list.copyInto(m);
		for(int j=0;j<size;j++)
		{
			System.out.println(m[j]);
		}
	}
}
	