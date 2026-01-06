class MyThread extends Thread{
    public void run(){
        System.out.println("Running in thread: "+Thread.currentThread().getName());
    }
}
public class ThreadName{
    public static void main (String [] args){
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Worker-1");
        t2.setName("Worker-2");

        t1.start();
        t2.start();
    }
}