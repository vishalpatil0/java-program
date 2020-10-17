package com.company;

public class OperatorInJava {
    public static void main(String[] args) {
        int a=0;
        //assignement operator
        System.out.println(a=4); //output of this statement is 4 because the expression of right side of 'equal to get executed first and then assigned the value to left side of 'equal to' means to a variable
        System.out.println(4==4); //this will return true

        /* logical operator */
        System.out.println(4==4 && 3==3);
        System.out.println(4==4 && 3==2);
        System.out.println(4==4 || 3==2);
        System.out.println(4==4 || 3==3);

        System.out.println(4!=4);

        //bitwise operator

        System.out.println(3&3);

    }
}
