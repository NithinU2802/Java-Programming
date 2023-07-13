/******************************************************************************

    Convert the String form HexaDecimal to Decimal.
    
Input:
A5

Output:
165


Input:
292

Output:
658

*******************************************************************************/
import java.util.*;

public class Main
{
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	int res=0,hex=1;
	for(int i=s.length()-1;i>=0;i--){
	    if(Character.isAlphabetic(s.charAt(i)))
	        res+=hex*(Integer.parseInt(String.valueOf(s.charAt(i)-55)));
	    else
	        res+=hex*((int)s.charAt(i)-48);
	    hex*=16;
	}
	
	System.out.println(res);
	}
}
