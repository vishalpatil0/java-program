import static java.lang.System.out;
import java.util.Scanner;
class AreaUsingMethodOverloading
{
		void get(int x,int y)
		{
		    out.format("Area is %d\n",x*y);
        }
        void get(float z, float c)
		{
		    out.format("Area is %1f\n",(0.5*z*c));
        }
        
        public static void main(String args[])
		{
			byte ch;
         	out.println("1-Square\n2-Triangle");
			Scanner sc=new Scanner(System.in);
			AreaUsingMethodOverloading pv=new AreaUsingMethodOverloading();
        	ch=sc.nextByte();
       		if(ch==1)
			{
				int l,k;
				out.println("Enter the numbers");
				l=sc.nextInt();
				k=sc.nextInt();
				pv.get(l,k);
			}
			else if(ch==2)
			{
				float o,p;
				out.println("enter the numbers");
				o=sc.nextFloat();
				p=sc.nextFloat();
				pv.get(o,p);
			}
			else
			{
				out.println("Please enter valid choice");
			}
			}		
}	