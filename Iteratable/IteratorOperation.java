/******************************************************************************

Iterable interface usage in a list...

Input:
1 2 3 4 

Output:
Even Numbers:
2 4
Odd Numbers:
1 3

Input:
2 3 9 3

Output:
Even Numbers:
2
Odd Numbers:
3 9 3



*******************************************************************************/
import java.util.*;

public class Main
{
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String[] s=x.nextLine().split(" ");
	List<Integer> a=new ArrayList<Integer>();
	for(String i:s) a.add(Integer.parseInt(i));
	Iterator i=a.iterator();
	int t;
	System.out.println("Even Numbers: ");
	while(i.hasNext()){
	    t=Integer.valueOf(i.next().toString());
	    if(t%2==0){   
	    System.out.print(t+" ");
	    i.remove();
	    }
	}
	System.out.println();
	System.out.println("Odd Numbers: ");
	for(int in:a) System.out.print(in+" ");
	}
}
