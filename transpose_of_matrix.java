import static java.lang.System.out;
import java.util.*;
class transpose_of_matrix
{
  public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
	int i,j,k,r1,c1,c2,r2;
	int mat1[][]=new int[10][10];
	int mat2[][]=new int[10][10];
	out.println("Enter the number of rows and columns for matrix 1");
	r1=sc.nextInt();
	c1=sc.nextInt();
	out.println("Enter the number of rows and columns for matrix 2");
	r2=sc.nextInt();
	c2=sc.nextInt();
	if(r1==c2)
	{
	out.println("Transpose is possible");
	out.println("Enter the elements in matrix 1");
	for(i=0;i<r1;i++)
	{
		for(j=0;j<c1;j++)
		{
			mat1[i][j]=sc.nextInt();
		}
	}
	out.println(" elements in matrix 1");
	for(i=0;i<r1;i++)
	{
		for(j=0;j<c1;j++)
		{
		  out.println(mat1[i][j]);
		}
	}
	for(i=0;i<r1;i++)
	{
		for(j=0;j<c2;j++)
		{
			mat2[j][i]=mat1[i][j];
		}
	}
	out.println("Transpose matrix is ");
	for(i=0;i<r1;i++)
	{
		for(j=0;j<c1;j++)
		{
			out.println(mat2[i][j]);
		}
	}
	}
}
}	
	