class Circle {
    float radius = 0.0f;
    synchronized void output(){
        if(radius == 0.0) {
            System.out.println("waiting for radius input");
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Area of circle is == "+3.14*radius*radius);
    }
    synchronized void input(float r){
        radius = r;
        notify();
    }
}
public class InterThreadCommunication{
    public static void main(String[] args) {
        final Circle circle= new Circle(); 
        new Thread(){
            public void run() {
                circle.output();
            };
        }.start();
        new Thread(){
            public void run() {
                circle.input(3.4f);
            };
        }.start();
    }
}