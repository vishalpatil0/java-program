import java.util.*;
import static java.lang.System.out;
class multidimensional_multiplication
{
 public static void main(String args[])
 {
   out.println("Enter the limit of matrices");
   Scanner sc=new Scanner(System.in);
   int limit=sc.nextInt();
   int m1[][]=new int[limit][limit];
   int m2[][]=new int[limit][limit]; 
   int m3[][]=new int[limit][limit];
   out.println("enter the number of rows and columns for matrix 1");
   int r1=sc.nextInt();
   int c1=sc.nextInt();
   out.println("enter the number of rows and columns for matrix 2");
   int r2=sc.nextInt();
   int c2=sc.nextInt();
   if(r1==c2)
   {
    out.println("Multiplication possible");
	out.println("Enter elements in matrix 1");
	for(int i=0;i<r1;i++)
	{
	 for(int j=0;j<c1;j++)
	 {
	   m1[i][j]=sc.nextInt();
	 }
	}
	out.println("Enter elements in matrix 2");
	for(int i=0;i<r2;i++)
	{
	 for(int j=0;j<c2;j++)
	 {
	   m2[i][j]=sc.nextInt();
	 }
	}
	for(int i=0;i<r1;i++)
	{
	 for(int j=0;j<c1;j++)
	 {
	   for(int k=0;k<c1;k++)
	   {
	     m3[i][j]=m3[i][j]+m1[i][j]*m2[i][j];
	   }
	 }
	}
    out.println("Mulliplication is");
	for(int i=0;i<r1;i++)
	{
	 for(int j=0;j<c1;j++)
	 {
	   out.println(m3[i][j]);
	 }
	}
  }
  else
  {
   out.println("Multiplcation is not possible");
  }
 }
} 
		
	
	