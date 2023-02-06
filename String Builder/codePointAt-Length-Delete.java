/******************************************************************************

String Builder episode 2

codePointAt, length and deletion.....

Input: 
Nithin

       
Output: 
length: 6
Unicode: 78
deletion: Nthin 

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	StringBuilder a=new StringBuilder(s);
	System.out.println("length: "+a.length());
	System.out.println("Unicode: "+a.codePointAt(0));
	a.delete(1,2);
	System.out.println("Deletion: "+a);
	}
}
