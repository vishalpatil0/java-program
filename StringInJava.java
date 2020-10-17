package com.company;
/*
Sting is a class and we create a object of class when we declare and initialize variable in class

it is not like other primitive data types
String are immutable and cannot be change
Means sting never change the memory location where string is stored never change and
when we modify the string variable the variable points to the new memory location
 */
public class StringInJava {
    public static void main(String[] args) {
        String a="hellow there";
        String b=new String("hellow");

        System.out.println(a);
        System.out.println(b);


        b= b+"vishal";
        System.out.println(b);

        System.out.printf("the value of b is %s",b);
        float j=34.3333f;
        System.out.format("the value of b is %10.3f",j);  //format method is same as printf and %10.3f means 10 are the space it takes and 3 are the decimal it show after the point

//        Methods of string

        System.out.println(b.length()); //returns length of string

        System.out.println(b.toLowerCase());
        System.out.println(b.toUpperCase());
        b="    vishal      "; // as you can see there are white spaces in the string
        System.out.println(b);
        System.out.println(b.trim()); // this remove the white spaces in the string
        System.out.println(b.substring(2)); //2 is the index and the string which is return here is starting from index 2 of original string
        System.out.println(b.substring(0,4));

        System.out.println(b.replace('w','o')); //replace character in string
        System.out.println(b.replace("ow","000"));
        System.out.println(b.startsWith("hel"));
        System.out.println(b.endsWith("ow"));
        System.out.println(b.charAt(2)); //prints the character at index 2
        System.out.println(b.indexOf("ow")); //prints the index of character
        System.out.println(b.indexOf("ow",2)); //we can also give the starting index
        System.out.println(b.lastIndexOf("ow")); //gives the index of last occurance in string
        System.out.println(b.equals("hellow"));
        System.out.println(b.equalsIgnoreCase("Hellow"));

        //Escape sequence character

        System.out.println("hello \' \\");
    }
}
