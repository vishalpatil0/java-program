import java.util.*;

import static java.lang.System.out;
class vector_1
{
	public static void main(String args[])
	{
		Vector v1=new Vector();
		for(int i=0;i<args.length;i++)
		{
			v1.addElement(args[i]);
	    }
		v1.insertElementAt("asdf",2);
		String newlist=new String[v1.size()];
		v1.copyinto(newlist);
	    out.println("new list: ");
		int s=v1.size();
		for(int i=0;i<s;i++)
		{
			 out.println(newlist[i]);
		}
	}
}