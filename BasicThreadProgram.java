/*
In this program we executed two for loops simultaneously with the help of thread
We created thread here by extending Thread class.

Life cycle of threads
1. New : Thread is crated but not yet started.
2. Runnable : Start method got exectucted and it is before thread scheduler select it.
3. Running : Afte thread scheduler has selected it.
4. Not runnable : Thread alive, not eligible to run.
5. Terminated : Thread got terminate.

 */
class MyThread1 extends Thread{
    private String name;
    public MyThread1(String name){
        this.name=name;
    }
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(name+" is running.....");
        }
    }
}
public class BasicThreadProgram {
    public static void main(String[] args) {
        MyThread1 m1=new MyThread1("Thread 1");  //State : New
        System.out.println("State of m1 thread  ="+m1.getState()); //state of thread
        MyThread1 m2=new MyThread1("Thread 2");
        m1.start(); //State : Runnable
        m2.start();
        System.out.println("Id of m1 thread = "+m1.getId()); //returns id of theard
        System.out.println("State of m1 thread  ="+m1.getState()); //state of thread

        System.out.println("Name of m2 thread = "+m2.getName()); //returns name of thread
        System.out.println("Priority of m1 thread = "+m1.getPriority()); //returns prority of thread
        System.out.println("State of m1 thread  ="+m1.getState()); //state of thread
        System.out.println("Thread count = "+m1.activeCount()); //totoal number of currently running thread
    }
}
