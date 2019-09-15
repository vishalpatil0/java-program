import java.util.*;
import static java.lang.System.out;
class matrix_transpose
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int r1,c1,r2,c2,i,j;
		int mat1[][]=new int[10][10];
		int mat2[][]=new int[10][10];
		out.println("enter the number of rows and coloumns of matrix 1");
		r1=sc.nextInt();
		c1=sc.nextInt();
		out.println("enter the number of rows and coloumns of matrix 2");
		r2=sc.nextInt();
		c2=sc.nextInt();
		if(r1==c2)
		{
			out.println("transpose is possible");
		out.println("enter the elements in matrix 1");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				mat1[i][j]=sc.nextInt();
			}
		}
		out.println("elements of matrix 1 are");
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
		out.println("transpose matrix is");
		for(i=0;i<c2;i++)
		{
			for(j=0;j<r1;j++)
			{
				out.println(mat2[i][j]);
			}
		}
		}
		else 
		{
			out.println("plz try again");
		}
	}
}