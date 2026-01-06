class EvenThread extends Thread{
    public void run(){
        for( int i=2; i<=10; i+=2)
        System.out.println("EvenNumbers:"+i);
    }
}

class OddThread extends Thread{
    public void run(){
        for(int i = 1; i<=11; i+=2){
            System.out.println("Odd Numbers: "+i);
        }
    }
}

public class EvenOddThread {
    public static void main (String [] args) throws InterruptedException{
        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();
        t1.start();
        t1.join();
        t2.start();
    }
}

