package com.company;
import java.util.Scanner;
public class Input_IN_Java {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number ");
        String a=sc.next(); // string but this method only read only one word
        System.out.println(a);
        String g=sc.nextLine(); // this method reads the whole line
        System.out.println(g);
        char b=sc.next().charAt(0); //next() method is basically used to read character but charAt(index of string) is return the first index of the string
        System.out.println(a);

        System.out.println(sc.hasNextInt()); // this method tell if the given input is integer or not
    }
}
