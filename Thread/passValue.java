/******************************************************************************

Pass value of string and print the required value..

Output:
Pass value of thread...

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	Thread t=new Thread("Pass value of thread...");
	t.start();
	String s=t.getName();
	System.out.print(s);
	}
}
