/******************************************************************************

Implementation of lambda Expression in default interface....

Input:
4
Nithin

Output:
WELCOME You Nithin
16

Input:
8 
Clams

Output:
WELCOME You Clams
64

*******************************************************************************/
import java.util.*;

interface functionInter{
    void abstraction(int a,String n);
    default void print(){
        System.out.print("WELCOME YOU ");
    }
}


public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int b=x.nextInt();
	x.nextLine();
	String s=x.nextLine();
	
	functionInter a=(int y,String n)->{
	    System.out.println(n);
	    System.out.println(y*y);
	};
	a.print();
	a.abstraction(b,s);
	}
}
