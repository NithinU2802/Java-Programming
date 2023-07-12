/******************************************************************************

    Program to convert Binary to Decimal for the given input.
    

Input: 
10111

Output:
23

Input:
101100

Output:
44
    
*******************************************************************************/
import java.util.*;

public class Main
{
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	int res=0,b=1;
	for(int i=s.length()-1;i>=0;i--){
	    if(s.charAt(i)=='1')
	        res+=b;
	    b*=2;
	}
	System.out.println(res);
	}
}
