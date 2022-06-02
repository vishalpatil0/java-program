class MyThread1 extends Thread{
    private String name;
    public MyThread1(String name){
        this.name=name;
    }
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(name+" is running.....");
            try{
                Thread.sleep(500);
            } catch(InterruptedException e){
                System.out.println(e.getLocalizedMessage());
            }
        }
    }
}
public class ThreadMethods {
        public static void main(String[] args) {
            MyThread1 t1=new MyThread1("Thread 1");
            MyThread1 t2=new MyThread1("Thread 2");
            t1.start();
            // try{
            // t1.join();// wait until t1 complete its execution
            // }
            // catch(InterruptedException e){
            //     System.out.println(e.getMessage());
            // }
            t2.start();
    }
}
