/******************************************************************************

Make use of constructor to run a thread without using extend the thread class.

Output: I am running..

*******************************************************************************/

public class Main implements Runnable
{
    
    public void run(){
        System.out.print("I am running..");
    }
    
	public static void main(String[] args) {
	Main b=new Main();
	Thread t=new Thread(b);
	t.start();
	}
}
