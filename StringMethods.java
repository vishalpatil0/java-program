import java.util.Scanner;

public class StringMethods {
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
        
        //Lower Case
        System.out.printf("Lower case of %s is %s\n",str3,str3.toLowerCase());
        //Upper Case
        System.out.printf("Lower case of %s is %s\n",str3,str3.toUpperCase());

        //trim --> remove the leading and trailing space in the string.
        String trimmedString="    Vishal Patil     ";
        System.out.printf("After using trim %s = %s\n ",trimmedString,trimmedString.trim());

        //substring(startIndex,endIndex)
        System.out.printf("Substring of %s is %s\n",str3,str3.substring(2,5));

        //replace
        System.out.printf("Old string : %s and New String : %s",str3,str3.replace('i','o'));
        System.out.printf("Old string : %s and New String : %s",str3,str3.replace("i","EREN"));

        //startswith("String") retrun boolean
        //endswith("String")    return boolean
        //charAt(number)        return character
        //indexOf("string")     return index of first character of string
        //equls("String")       return true if value is same.
        //equalIgnoreCase("String") return true if value is same irrespective of the string.
    }
}
