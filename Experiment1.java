

public class Experiment1{
  
  static int add(int n)
  { 
    if(n==0 || n==1)
    {
      return n;
    }
    else
    {
      return add(n-1)+add(n-2);/*
            
                 4/2   (2+1=3)    4/1 =     1+0       
              -------------------------
                 3/1   +   3/1=2
              --------------------------
                 2/1   +   0=1 
              ---------------------------
              


      */
    }
   
  }

  public static void main(String args[]) {
   
  for(int i=0;i<=10;i++)
  {
    System.out.println(add(i));
  }
  }
}