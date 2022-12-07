class Singleton {
    private static Singleton singleton = null;
    private String str;
    
    private Singleton(){
        str = "vishal patil";
    }

    public static Singleton getSingletonInstance(){
        if(singleton == null){
            singleton = new Singleton();    
        }
        return singleton;
    }

    String getString(){
        return str;
    }
    void setString(String str){
        this.str = str;
    }
}
public class SingletonClass{
    public static void main(String[] args) {
        Singleton a = Singleton.getSingletonInstance();
        Singleton b = Singleton.getSingletonInstance();
        Singleton c = Singleton.getSingletonInstance();
        System.out.println("a.str --> "+a.getString());
        System.out.println("b.str --> "+b.getString());
        System.out.println("c.str --> "+c.getString());
        b.setString("joker");
        System.out.println("a.str --> "+a.getString());
        System.out.println("b.str --> "+b.getString());
        System.out.println("c.str --> "+c.getString());
    }
}