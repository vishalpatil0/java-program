import java.util.*;
public class Largestof3numbers{
    public static void main(String[] args) {
        System.out.println("Enter 1st number : ");
        Scanner sc=new Scanner(System.in);
        int Number_1=sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int Number_2=sc.nextInt();
        System.out.println("Enter 3rd number : ");
        int Number_3=sc.nextInt();
        if(Number_1>Number_2 && Number_1>Number_3)
        {
            System.out.println(Number_1+" is largest");
        }
        else if(Number_2>Number_1 && Number_2>Number_3)
        {
            System.out.println(Number_2+" is largest");
        }
        else
        {
            System.out.println(Number_3+" is largest");
        }
    }
}