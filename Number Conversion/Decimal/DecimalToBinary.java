package Decimal;
/******************************************************************************

    Program to convert Decimal to Binary for the given input.
    

Input: 
23

Output:
10111

Input:
44

Output:
101100
    
*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	String res="";
	while(n>0){
	    res=String.valueOf(n%2)+res;
	    n/=2;
	}
	n=Integer.parseInt(res);
	System.out.println(n);
	}
}
