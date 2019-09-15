import static java.lang.System.out;
import java.util.*;
class area
{
		public static void get(int x,int y)
		{
			int a,b;
			a=x;
			b=y;
		    out.println("your area is"+(a*b));
        }
        public static void get(float z, float c)
		{
			float g,h;
			g=z;
			h=c;
		    out.println("your area is"+(0.5*g*h));
        }
        
        public static void main(String args[])
		{
			int ch;
         	out.println("1-square\n2-triangle");
            Scanner sc=new Scanner(System.in);
        ch=sc.nextInt();
        if(ch==1)
        {
			int l,k;
			out.println("enter the numbers");
			l=sc.nextInt();
			k=sc.nextInt();
            get(l,k);
        }
        else if(ch==2)
        {
			float o,p;
			out.println("enter the numbers");
			o=sc.nextFloat();
			p=sc.nextFloat();
           get(o,p);
        }
        else
	    {
           out.println("it is wrong choice");
        }
		}		
}	