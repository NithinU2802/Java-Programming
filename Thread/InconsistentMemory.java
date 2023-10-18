/******************************************************************************

    Thread Interface Error with inconsistent Memory

*******************************************************************************/
import java.util.*;

class Memory{
    static int i=1;
    void increment(){
        for(int j=0;j<5;j++){
            i++;
            System.out.println(i);
        }
    }
    void decrement(){
        for(int j=0;j<5;j++){
            i--;
            System.out.println(i);
        }
    }
}

public class Main
{
	public static void main(String[] args) {
	Memory memory=new Memory();
	Thread thread1=new Thread(){
	    public void run(){
	        memory.increment();
	    }
	};
	Thread thread2=new Thread(){
	    public void run(){
	        memory.decrement();
	    }
	};
	thread1.start();
	thread2.start();
	}
}
