/******************************************************************************

Create a thread in java..


Output:
thread is running...

*******************************************************************************/


public class Main extend Thread
{
    public void run(){
        System.out.print("thread is running...");
    }
    
	public static void main(String[] args) {
	Main t=new Main();
	t.start();
	}
}
