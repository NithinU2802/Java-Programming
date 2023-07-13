/******************************************************************************

    Convert the String form HexaDecimal to Binary.
    
Input:
A5

Output:
10100101


Input:
292

Output:
1010010010

*******************************************************************************/
import java.util.*;

public class Main
{
    public static String binary(char a){
        int s=0;
        if(Character.isAlphabetic(a))
            s=a-55;
        else 
            s=a-48;
        String res="";
        while(s>0){
            if(s%2==0)
                res='0'+res;
            else
                res='1'+res;
            s/=2;
        }
        while(res.length()<4)
            res='0'+res;
        return res;
    }
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	String res="";
	for(int i=0;i<s.length();i++)
	    res+=binary(s.charAt(i));
	System.out.println(Long.parseLong(res));
	}
}
