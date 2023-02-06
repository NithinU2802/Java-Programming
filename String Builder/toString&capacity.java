/******************************************************************************

String Builder episode 1

toString, append and capacity...

Input: 
Nithin
K Ramakrishnan College Of Technology
       
Output: 
Nithin
K Ramakrishnan College Of Technology
toString and append: Nithin Name
capacity: 36
append data: K Ramakrishnan College Of Technology


*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	String r=x.nextLine();
	StringBuilder a=new StringBuilder(s);
	a.append(" Name");
	System.out.println("toString and append: "+a);
	StringBuilder b=new StringBuilder(10);
	b.append(r);
	System.out.println("capacity: "+b.capacity());
	System.out.println("Append data: "+b.toString());
	}
}
