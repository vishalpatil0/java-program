/*
NOTE:
    1)abstract: just a imaginary thing which does not have a concrete or physical base
    2)abstract method:  a method which must be used override in subclass. Define with abstract keyword
    3)abstract class:   class having abstract method is directly abstract class
                        and must be define with abstract keyword
                        abstract class not only have abstract method but also non abstract method.
    4)either the subclass of abstract class is abstract or it must oveerride all the abstract methods
*/abstract class vishu {
    abstract void ok();
    void disco(){
        System.out.println("disco");
    }
}
class namu extends vishu{
    void ok()
    {
        System.out.println("hello there");
    }
}
public class AbstractFunction_Prog1 extends namu {
    public static void main(String[] args) {
            namu obj=new namu();
            obj.ok();
            obj.disco();
    }
}
