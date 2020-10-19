class Exception_Bascis
{
  public static void main(String args[])
  {
    System.out.println("Welcome");
    try
    {
      int n1=Integer.parseInt(args[0]);		
      int n2=Integer.parseInt(args[1]);
      System.out.println("Answer is:"+(n1/n2));
    }
    catch(Exception e)
    { 
      System.out.format("Exception is : %s\n",e);
    }
    finally
    {
      System.out.println("Finally Statement");
    }
    System.out.println("After Finally");
  }
}
    
	 