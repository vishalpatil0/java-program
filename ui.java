import java.util.*;
class ui {
   public static void main(String[] args) {

      int age[]=new int[10];
      Scanner sc=new Scanner(System.in);
	  for (int i = 0; i < 5; ++i) {
         age[i]=sc.nextInt();
	    
	}
      for (int i = 0; i < 5; ++i) {
         System.out.println("Element at index " + i +": " + age[i]);
      }
   }
}