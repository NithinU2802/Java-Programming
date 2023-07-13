/******************************************************************************

    Convert the String form HexaDecimal to Octal.
    
Input:
A5

Output:
245


Input:
292

Output:
1222

*******************************************************************************/
import java.util.*;

public class Main
{
    public static String binary(char a){
        int s=0;
        String res="";
        if(a<='9')
            s=Integer.parseInt(String.valueOf(a-48));
        else
            s=Integer.parseInt(String.valueOf(a-55));
        
        while(s>0){
            res=String.valueOf(s%2)+res;
            s/=2;
        }
        while(res.length()<4) res='0'+res;
        return res;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String st=x.nextLine();
	String hex="";
	for(int i=0;i<st.length();i++)
	    hex+=binary(st.charAt(i));
	int c=0,b=1,s=0;
	String res="";
	for(int i=hex.length()-1;i>=0;i--){
	    c++;
	    if(hex.charAt(i)=='1')
	        s+=b;
	    if(c==3){
	        c=0;
	        b=1;
	        res=String.valueOf(s)+res;
	        s=0;
	    }else b*=2;
	}
	if(s!=0)
	    res=String.valueOf(s)+res;
	System.out.println(res);
	}
}
