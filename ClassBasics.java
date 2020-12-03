//  In java there is only one public class
//  in java only public,abstract and final are allowed for class.
//  Final class:    a) Final classes are immutable classes
//                  b) Final class can't be extended.
 
class vishal{ 
    private int id;
    private String name;
    void setData(int n,String name)
    {
               id=n;
               this.name=name;

    }
    void getData()
    {
        System.out.println(id+name);
    }
}
public class ClassBasics {

    public static void main(String[] args) {
        vishal v=new vishal();
        v.setData(23, "Vishal");
        v.getData();
    }
    
}
