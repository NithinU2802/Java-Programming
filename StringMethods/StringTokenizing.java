/******************************************************************************

    String Tokenizer and their implementation

*******************************************************************************/
import java.util.*;

public class Main{
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	String d=" : ";
	
	StringTokenizer str=new StringTokenizer(s,d);
	int n=str.countTokens();
	while(str.hasMoreElements())
	    System.out.println(str.nextToken());
	System.out.println(n);
	System.out.println(str);
	}
	
}
