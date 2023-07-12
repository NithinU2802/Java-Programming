/******************************************************************************

    Program to convert Binary to HexaDecimal for the given input.
    

Input: 
10111

Output:
27

Input:
101100

Output:
2C
    
*******************************************************************************/
import java.util.*;

public class Main
{
    public static String hex(int sm,String res){
            if(sm<=9) 
	            res=String.valueOf(sm)+res;
	        else if(sm==10)
	            res='A'+res;
	        else if(sm==11)
	            res='B'+res;
	        else if(sm==12)
	            res='C'+res;
	        else if(sm==13)
	            res='D'+res;
	        else if(sm==14)
	            res='E'+res;
	        else if(sm==15)
	            res='F'+res;
	  return res;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	int c=0,b=1,sm=0;
	String res="";
	for(int i=s.length()-1;i>=0;i--){
	    if(s.charAt(i)=='1')
	        sm+=b;
	    c++;
	    if(c==4){
	        b=1;
	        res=hex(sm,res);
	        sm=0;
	        c=0;
	    }else
	    b*=2;
	}
	if(sm!=0)
	    res=hex(sm,res);
	System.out.println(res);
	}
}
