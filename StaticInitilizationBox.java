//Static block is used to initilize static data member in java.
//static block is executed before constructors.


class Demo{
    static byte a=10;
    static{
        a=102;
    }
}
public class StaticInitilizationBox {
    public static void main(String[] args) {
        Demo d=new Demo();
        System.out.println(d.a);
    }
}
