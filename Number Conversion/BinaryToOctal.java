/******************************************************************************

    Program to convert binary to octal for the given input.
    
Input : 100100
Output: 44

Input : 1100001
Output : 141
    
*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int b=1,c=0,sm=0;
	String res="";
	while(n>0){
	    if((n%10)==1) 
	        sm+=b;
	    n/=10;
	    c++;
	    if(c==3){
	        res=String.valueOf(sm)+res;
	        b=1;
	        sm=0;
	        c=0;   
	    }else 
	    b*=2;
	}
	if(sm!=0)
	    res=String.valueOf(sm)+res;
	System.out.println(res);
	}
}
