/******************************************************************************

    Computation of ComputeIfAbsent in HashMap

*******************************************************************************/
import java.util.*;


public class Compute_If_Absent
{
	public static void main(String[] args) {
	HashMap<Integer,String> s=new HashMap<Integer,String>();
	s.put(1,"Nithin");
	for(int i=0;i<5;i++)
	    System.out.println(s.computeIfAbsent(i,k->"Name"));
	 System.out.println("Finally.....!");
	 for(int i:s.keySet())
	    System.out.println(s.get(i));
	}
}
