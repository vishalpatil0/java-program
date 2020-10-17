//object pass the reference in function not copy
//variable pass the copy in function not refernce

public class ChangeArrayFunction {
   static void change(int arr[])
   {
       arr[0]=234;
   }

  public static void main(String args[]) {
    int a[]={1,2,3,4};
    change(a);
    for(int elt:a)
    {
        System.out.println(elt);
    }
  }
}
