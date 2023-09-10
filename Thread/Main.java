public class Main extends Thread{

    public void run(){
        System.out.println("I am Running..!");
    }
    
    public static void main(String[] arg){
        Main thread=new Main();
        thread.start();
        System.out.println("Execution Completed");
    }

}
