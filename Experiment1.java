import java.util.Scanner;

class Experiment1{
  public static void main(String[] args) {
    String str="Vishal";
    String str1=new String("Vishal Patil");
    System.out.println("String is "+str);
    System.out.printf("String is %2.2s",str1);
    System.out.println();
    Scanner sc=new Scanner(System.in);
    String str3=sc.nextLine();
    System.out.format("String is %s",str3);
  }
}