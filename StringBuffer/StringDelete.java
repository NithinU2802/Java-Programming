/******************************************************************************

delete usage StringBuffer....,

Input:
Hello who are you? Nithin

Output:
Hello Nithin

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s="Hello who are you? ";
	System.out.print(s);
	String a=x.nextLine();
	s+=a;
	StringBuffer b=new StringBuffer(s);
	b.delete(6,19);
	System.out.println(b.toString());
	}
}
