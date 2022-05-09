import java.util.Scanner;
public class Vishal_Patil {
    public static void main(String[] args) {
        //basic string declaration and intilisation 
        String str="Vishal";                                //one way to create a string.
        String str1=new String("Vishal Patil");     //another way to create a string.
        System.out.println("String is "+str);
        System.out.printf("String is %2.2s",str1);
        System.out.println();
        Scanner sc=new Scanner(System.in);
        String str3=sc.nextLine();
        System.out.format("String is %s",str3);

        //String Methods
        //Length function
        System.out.printf("Length of %s is --> %d\n",str3,str3.length());
    }
}
