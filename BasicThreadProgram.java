/*
In this program we executed to two for loops simultaneously with the help of thread

 */
class MyThread1 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Thread 1 is running.....");
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Thread 2 is running.....");
        }
    }
}
public class BasicThreadProgram {
    public static void main(String[] args) {
        MyThread1 m1=new MyThread1();
        MyThread2 m2=new MyThread2();
        m1.start();
        m2.start();
    }
}
