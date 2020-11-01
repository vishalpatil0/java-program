class A{
    public void Method1(){
        System.out.println("This is method 2 of class A");
    }
}
class B extends A
{
    @Override
    public void Method1()
    {
        System.out.println("This is method 2 of class B");
    }
}
public class Method_Overriding
{   
    public static void main(String[] args) {
        B b=new B();
        b.Method1();
    }
}

/*
in java you can't override the static method and 

the override method must have the same parameter with same datatype and same access specifier

*/