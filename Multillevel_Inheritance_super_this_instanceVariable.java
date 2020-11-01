/*An instance variable is a variable which is declared in a class but outside of constructors, methods, or blocks. 
Instance variables are created when an object is instantiated, and are accessible to all the constructors, methods, or blocks in the class.
 Access modifiers can be given to the instance variable. */

 // by default super class invoked default constrcutor 

class base
{
    String gh="instance variable of base class called using super keyword";
    private int x;
    protected base()  
    {
        System.out.println("base class constructor");
    }
    protected void setx(int x)
    {
        this.x=x;
    }
    protected void getx()
    {
        System.out.println(x);
    }
}

class subClass extends base
{
    subClass()
    {
        System.out.println("subClass constructor");
        System.out.println(super.gh)  ;
    }
}
public class experiment extends subClass
{
    public static void main(String[] args) {
        experiment e=new experiment();  // base class constructor also get executed when derived class object is created 
        e.setx(23);                     // firstly base class constructor get executed
        e.getx();
    }
}