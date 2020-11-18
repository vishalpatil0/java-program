//we can extends one interface into another interface.  
interface base{
    void method1();
}
interface derived extends base{
    void method2();
}
class MyClass1 implements derived{
    public void method1(){
        System.out.println("This is method one");
    }
    public void method2(){
        System.out.println("This is method two");
    }
}
public class Inheritance_In_Interface {
    public static void main(String[] args) {
        MyClass1 mclass=new MyClass1();
        mclass.method1();
        mclass.method2();
    }
}
