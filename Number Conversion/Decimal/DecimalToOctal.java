/******************************************************************************

    Convert the integer form decimal to octal.
    
Input:
165

Output:
245


Input:
658

Output:
1222

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	String res="";
	while(n>0){
	    res=String.valueOf(n%8)+res;
	    n/=8;
	}
	System.out.println(res);
	}
}
