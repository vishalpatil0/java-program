import java.util.*;
class vector_4
{
	public static void main(String args[])
	{
		Vector vtr=new Vector(10,2);
		int size=args.length;
		for(int i=0;i<size;i++)
		{
			vtr.addElement(args[i]);
		}
		int zx=vtr.size();
		System.out.println("size of the vector is"+zx);
		String str[]=new String[50];
		vtr.copyInto(str);
		for(int i=0;i<size;i++)
		{
			System.out.println(str[i]);
		}
	}
}