/******************************************************************************

delete usage StringBuffer....,

Input:
nihtiN

Output:
Nithin

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String a=x.nextLine();
	StringBuffer b=new StringBuffer(a);
	b.reverse();
	System.out.println(b.toString());
	}
}
