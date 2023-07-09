/******************************************************************************

    Program to Check Armstrong Number between Two Integers.
    
Input : 
100 200

Output :
153
Explanation : 100 and 200 are given  
two integers.
 153 = 1*1*1 + 5*5*5 + 3*3*3  
     = 1 + 125 + 27
     =  153
Therefore, only 153 is an Armstrong number between 100 and 200.

Input:
50 500

Output:
153 370 371 407 

*******************************************************************************/
import java.util.*;

public class Main
{
    
    public static boolean isArmstrong(int a){
        int c=0,t=a,k=0;
        while(t>0){
            k=t%10;
            c+=(k*k*k);
            t/=10;
        }
        if(c==a)
            return true;
        return false;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int a=x.nextInt(),b=x.nextInt();
	for(int i=a+1;i<b;i++)
	    if(isArmstrong(i))
	        System.out.print(i+" ");
	}
}
