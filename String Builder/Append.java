/******************************************************************************

StringBuilder make append operation.......

Input: 
Nithin 

output:
Hi Nithin 


*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	StringBuilder a=new StringBuilder(s);
	a.append(" Hi");
	System.out.print(a);
	}
}
