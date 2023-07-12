package Octal;
/******************************************************************************

    Program to convert Octal to Decimal for the given input.
    

input: 
167

Output:
119

ex: 7*1 + 6*8 + 1*64
    
*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int s=0,res=0,oct=1;
	while(n>0){
	    res+=(n%10)*oct;
	    oct*=8;
	    n/=10;
	}
	System.out.println(res);
	}
}
