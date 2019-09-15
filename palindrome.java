import java.util.*;
class palindrome
{
	public static void main(String args[])
	{
		 int num,rev=0,temp;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("\nEnter the number");
		 num=sc.nextInt();
		 temp=num;
		 while(num>0)
		 {
			 rev=rev*10+num%10;
			 num=num/10;
		 }
		 if(temp==rev)
		 {
           System.out.println(temp+"\n this number is palindrome");
		  }
		  else
		  {
		   System.out.println(temp+"\nthis num is not palindrome");
		  }
		 
		  
		  
		 
	}
}