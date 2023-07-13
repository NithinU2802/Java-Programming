/******************************************************************************

    Convert the integer form decimal to HexaDecimal.
    
Input:
165

Output:
A5


Input:
658

Output:
292

*******************************************************************************/
import java.util.*;

public class Main
{
    public static String hexa(int n){
        if(n<=9) 
            return String.valueOf(n);
        else
            return String.valueOf((char)('A'+(n-10)));
            
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	String res="";
	while(n>0){
	    res=hexa(n%16)+res;
	    n/=16;
	}
	System.out.println(res);
	}
}
