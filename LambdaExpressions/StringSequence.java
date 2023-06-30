/******************************************************************************

    Lambda Function to implement the string to print once and twice..!
    
Input:
Nithin
Jameer

Output:
Nithin
Jameer Jameer

*******************************************************************************/
import java.util.*;

public class Main
{
    interface print{
        void stringPrint(String a);
    }
    
    void display(String a,print obj){
        obj.stringPrint(a);
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	print one=(String a)->{ System.out.println(a); };
	print twice=(String a)->{ System.out.print(a+" "+a); };
	Main m=new Main();
	String a=x.nextLine();
	String b=x.nextLine();
	m.display(a,one);
	m.display(b,twice);
	}
}
