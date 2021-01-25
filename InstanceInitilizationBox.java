/*There are three places in java where you can perform operations:
1-method
2-constructor
3-block*/

class Demo{
    //float a; //default value of numeric type variable is 0 and character type datatype is blank
    // boolean a; //and default value of boolean type data type is false
    int a;
    // a=10;  // you can't assigned value like this thats why we need instance initilization box.

        //instance initilization box
        //instance initilization box are executed before constructors.
        //They run each time when object of the class is created.
        //Instance Initialization Blocks run every time a new instance is created.
    {
        a=20;
    }
}

public class StaticDataMember{
    public static void main(String[] args) {
        Demo d=new Demo();
        System.out.println(d.a);        //value of a is 20
    }
}