class vishal{ //in java there is only one public class
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
