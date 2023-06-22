/******************************************************************************

Insert usage StringBuffer.

Input:
Nithin

Output:
Hello Nithin

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	StringBuffer b=new StringBuffer("Hello ");
	b.insert(6,s);
	System.out.println(b.toString());
	}
}
