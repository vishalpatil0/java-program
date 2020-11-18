class Phone{
    public void showTime(){
        System.out.println("8 am");
    }
    public void on(){
        System.out.println("Turning on phone........");
    }
}
class SmartPhone extends Phone{
    public void on() {
        System.out.println("Turning on smartphone...........");
    }
    public void music(){
        System.out.println("Playing music..........");
    }
}
public class Dynamic_Method_Dispatch{
    public static void main(String[] args) {
        Phone obj=new SmartPhone();
        // SmartPhone obj=new Phone();// not allowed
        obj.on();       //allowed
        obj.showTime(); //allowed
        // obj.music(); //not allowed

    }
}