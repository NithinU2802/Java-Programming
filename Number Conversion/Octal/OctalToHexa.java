/******************************************************************************

    Program to convert Octal to HexaDecimal for the given input.
    

input: 
167

Output:
77

input:
67 

Output:
37

Note: we need to refer that each digit should be 0 to 7
    
*******************************************************************************/
import java.util.*;

public class Main
{
    public static String bin(int a){
        String res="";
        while(a>0){
            res=(a%2)+res;
            a/=2;
        }
        return res;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	String binary="";
	while(n>0){
	    binary=bin(n%10)+binary;
	    n/=10;
	}
	String res="";
	int b=1,s=0,c=0;
	for(int i=binary.length()-1;i>=0;i--){
	    if(binary.charAt(i)=='1')
	        s+=b;
	    c++;
	    if(c==4){
	        res=String.valueOf(s)+res;
	        s=0;
	        c=0;
	        b=1;
	    }else 
	        b*=2;
	}
	if(s!=0)
	    res=String.valueOf(s)+res;
	System.out.println(res);
	}
}
