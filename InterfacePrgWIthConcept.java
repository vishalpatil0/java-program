/*
NOTE:
    1)  all the methods of interface are abstract methods (which does not have body).
    2)  after implementing interface all the method of it must be overridden.
    3)  difference between abstract and interface is that 
        abstract is a class so there is no multiple inheritance and interface have access to multiple inheritance
        means: we can create a class by implementing multiple interfaces.
    4)  variables in the interfaces are final so you can't change them.
    5)  while overriding the method of interface they should be declare as public.
*/
interface camera{
    int a=10;
    void click();
}
interface torch{
    void on();
}
class mobile implements camera,torch{
    public void click(){
        System.out.println("Photo is clicked.");
    }
    public void on(){
        System.out.println("Torched in turning on.");
    }
}
public class InterfacePrgWIthConcept {
    public static void main(String[] args) {
        mobile m=new mobile();
        m.click();   
        m.on();    
        // m.a=13; //we cannot assign value to the final variable.
    }
}
