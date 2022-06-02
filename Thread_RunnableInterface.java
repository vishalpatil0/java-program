/*
There is no start method in Runnable interface
so to start the thread we have to create object of Thread class and pass the objecto fo thrad in it
syntax : new Thread(<<Runnalbe interface implemented class object>>);


Why Runnable interface is preferable than extending the Thread class?
- Runnable interface is always preferred because, the class implementing it can implement as many interfaces as a developer can, and also extend another class.

- Whereas extending the Thread class, it can not extend another class, as Java supports only single inheritance.

- A thread class can be extended but then any other class cannot be extended.

- If a runnable interface is used the class can be extended which is required other than the thread class.

- The main reason to run an runnable interface is because Java does not support multiple inheritance.
*/

class MyRunnableInterface1 implements Runnable{
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println("Thread 1 is running...");
        }
    }
}
class MyRunnableInterface2 implements Runnable{
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println("Thread 2 is running...");
        }
    }
}
class Thread_RunnableInterface{
    public static void main(String[] args) {
        MyRunnableInterface1 r1=new MyRunnableInterface1();
        MyRunnableInterface2 r2=new MyRunnableInterface2();
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();
    }
}