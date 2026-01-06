class NameTask implements Runnable{
    public void run(){
        for( int i =1;i<=5;i++){
            System.out.println("Hey! It's me Lokesh");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Thread interrupted");
            }  
        }
    }

}
public class RunnableThread{
    public static void main(String[] args){
        NameTask task = new NameTask();
        Thread t = new Thread(task);
        t.start();
    }
}