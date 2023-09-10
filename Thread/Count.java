/* 

Make use of count in thread

*/

public class Count extends Thread{
    
    public static int count=0;
    
    public void run(){
        count++;
    }
    
    public static void main(String[] arg){
        Main thread=new Main();
        Main thread1=new Main();
        thread.start();
        thread1.start();
        System.out.println("Count: "+count);
        count++;
        System.out.println("Count: "+count);
    }

}
