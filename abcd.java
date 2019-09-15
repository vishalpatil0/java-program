import java.util.*;
import java.util.Vector;
import static java.lang.System.out;
class abcd
{
	public static void main(String args[])
	{
		Vector  list=new Vector();
		int length=args.length;
		for(int i=0;i<length;i++)
		{
			list.addELement(args[i]);
		}
		list.insertElementAt("COBOL",2);
		int size=list.size();
		String listArray[]=new String[size];
		list.copyInto(listArray);
		System.out.println("list of languages");
		for(int i=0;i<size;i++)
		{
			out.println(listArray[i]);
		}
	}
}