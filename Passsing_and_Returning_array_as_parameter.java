public class Passsing_and_Returning_array_as_parameter{
  static void arr(int[] hello)
  {
    for(int a:hello)
    {
      System.out.println(a);
    }
  }
  static int[] vishu(){
    int ui[]={10,20,39};
    return ui;
  }
  public static void main(String[] args) {
    int arr[]={1,2,4,5};
    arr(arr);

    int jumbo[];
    jumbo=vishu();
    System.out.println(jumbo[1]);
  }    
}