import java.io.*;
class wrapper_1
{
	public static void main(String args[])
	{
		int i=10;
		System.out.println("primitive integer i:"+i);
		Integer i1=new Integer(i);
		System.out.println("primitive integer i converted to integer object");
		System.out.println("integer object  converted to primitive integer");
	    int j=i1.intValue();
        System.out.println("j:"+j);
        System.out.println("converting num to strings");
        int m=10,n=20;
         System.out.println("m:"+m);	
		 System.out.println("n:"+n);
		 String str1=Integer.toString(m);
		 String str2=Integer.toString(n);
		 System.out.println("concatenation of str1 and str2 :"+(str1+str2));
	}
}
		 