/******************************************************************************

Iterable to print elements form a list....

Input:
4
1 2 3 4

Output:
ArrayList
1 2 3 4

HashSet
1 2 3 4

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	
	//ArrayList
	List<Integer> a=new ArrayList<Integer>();
	int n=x.nextInt();
	System.out.println("ARRAYLIST");
	for(int i=0;i<n;i++) a.add(x.nextInt());
	a.forEach( (e)->{System.out.print(e+" ");});
	
	//HashSet
	System.out.println();
	System.out.println("HASH SET");
	Set<Integer> b=new HashSet<Integer>();
	for(int i:a) b.add(i);
	b.forEach((e)->{System.out.print(e+" "); });
	}
}
