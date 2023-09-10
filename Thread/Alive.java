/* 

To check thread whether it is alive

*/

public class Alive extends Thread{
    
    public static int count=0;
    
    public void run(){
        count++;
    }
    
    public static void main(String[] arg){
        Alive thread=new Alive();
        thread.start();
        while(thread.isAlive())
            System.out.println("I am Alive..!");
        System.out.println("Count: "+count);
        count++;
        System.out.println("Count: "+count);
    }

}
