/******************************************************************************

    Queue -> LinkedList Implementation

*******************************************************************************/
import java.util.*;

public class LinkedListUsage
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	Queue<Integer> queue=new LinkedList<Integer>();
	for(int i=0;i<n;i++)
	    queue.add(x.nextInt());
	System.out.println(queue);
	System.out.println(queue.remove());
	System.out.println(queue.peek());
	System.out.println(queue);
	System.out.println(queue.poll());
	}
}
