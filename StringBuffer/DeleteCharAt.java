/******************************************************************************

Delete single character usage StringBuffer....,

Input:
Nithins

Output:
Nithin

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	System.out.print("Enter Element to remove: "); // Works by providing index 
	int n=x.nextInt();
	StringBuffer b=new StringBuffer(s);
	b.deleteCharAt(n);
	System.out.println(b.toString());
	}
}
