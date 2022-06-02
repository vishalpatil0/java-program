/*
    Thread() : basic constructor
    Thread(String name) : takes thread name
    Thread(Runnable r) : takes object of class which have implmented runnable interface.
    Thread(Runnable r, String name) : thread name and runnable thread class
 * /
class MyThread extends Thread{
    MyThread(String name){
        super(name); 
    }
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("hello how are you?");
        }
    }
}
public class ThreadConstructors {
    public static void main(String[] args) {
        MyThread myThread=new MyThread("vishalThread");
        myThread.start();
        System.out.println("Thread name : "+myThread.getName());
    }
}
