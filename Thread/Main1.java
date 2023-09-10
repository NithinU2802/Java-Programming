public class Main1 implements Runnable{

    public void run(){
        System.out.println("I am Running..!");
    }
    
    public static void main(String[] arg){
        Main1 main=new Main1();
      //  thread.start();
        Thread thread=new Thread(main);
        thread.start();
        System.out.println("Execution Completed");
    }

}
