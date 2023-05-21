/******************************************************************************

    Calculate Average for the given elements available in a arraylist using 
lambda and streams.

Input:
2 4 6 2 7

Output:
4.2 


*******************************************************************************/
import java.util.*;

public class Main
{
    public static double average(List<Integer> a){
       return a.stream().mapToInt(i->i).average().getAsDouble();
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	List<Integer> a=new ArrayList<>();
	for(int i=0;i<n;i++) a.add(x.nextInt());
	System.out.println(average(a));
	}
}
