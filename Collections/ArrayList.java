/******************************************************************************

ArrayList in java.......

Input: 
1 2 4 9 

Output:
1 2 4 9

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String[] s=x.nextLine().split(" ");
	ArrayList<Integer> a=new ArrayList<Integer>();
	for(String i:s) a.add(Integer.parseInt(i));
	for(int i: a) System.out.print(i+" ");
	}
}
