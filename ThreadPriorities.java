class MyThread1 extends Thread{
    private String name;
    public MyThread1(String name){
        this.name=name;
    }
    @Override
    public void run(){
        while(true){
            System.out.println(name+" is running.....");
        }
    }
}

public class ThreadPriorities {
    public static void main(String[] args) {
        MyThread1 m1=new MyThread1("Thread 1 <<<OPTIONAL>>>"); 
        MyThread1 m2=new MyThread1("Thread 2");
        MyThread1 m3=new MyThread1("Thread 3");
        MyThread1 m4=new MyThread1("Thread 4");
        MyThread1 m5=new MyThread1("Thread 5 [[[IMPORTANT]]]");
        m5.setPriority(Thread.MAX_PRIORITY);
        m1.setPriority(Thread.MIN_PRIORITY);
        m3.setPriority(Thread.MIN_PRIORITY);
        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
    }
}
