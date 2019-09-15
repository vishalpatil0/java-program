import static java.lang.System.out;
import java.util.*;
class matrix_addition 
{
  public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
	int i,j,k,r1,c1,c2,r2;
	int mat1[][]=new int[10][10];
	int mat2[][]=new int[10][10];
	int mat3[][]=new int[10][10];
	out.println("Enter the number of rows and columns for matrix 1");
	r1=sc.nextInt();
	c1=sc.nextInt();
	out.println("Enter the number of rows and columns for matrix 2");
	r2=sc.nextInt();
	c2=sc.nextInt();
	out.println("Enter the elements in matrix 1");
	for(i=0;i<r1;i++)
	{
		for(j=0;j<c1;j++)
		{
			mat1[i][j]=sc.nextInt();
		}
	}
	out.println("Enter the elements in matrix 1");
	for(i=0;i<r2;i++)
	{
		for(j=0;j<c2;j++)
		{
			mat2[i][j]=sc.nextInt();
		}
	}
	for(i=0;i<r1;i++)
	{
		for(j=0;j<c2;j++)
		{
			mat3[i][j]=mat1[i][j]+mat2[i][j];
		}
	}
	out.println("The addition is ");
	for(i=0;i<r1;i++)
	{
		for(j=0;j<c1;j++)
		{
			out.println(mat3[i][j]);
		}
	}
	}
}
	
	