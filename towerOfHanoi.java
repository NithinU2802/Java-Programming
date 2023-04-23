/******************************************************************************

Tower of Hanoi implementation..

Input:
Enter number of Plates: 3
Enter Character (A or B or C) of starting rod: A 
Enter Character (A or B or C) of ending rod  : C 
Output:
Disk is moved from A to C 
Disk is moved from A to B 
Disk is moved from C to B 
Disk is moved from A to C 
Disk is moved from B to A 
Disk is moved from B to C 
Disk is moved from A to C 

*******************************************************************************/

import java.util.*;

public class Main
{
    
    public static void towerOfHanoi(int n,char s,char e,char in){
        if(n==0) 
        return;
        towerOfHanoi(n-1,s,in,e);
        System.out.println("Disk is moved from "+s+" to "+e);
        towerOfHanoi(n-1,in,e,s);
    }
    
    public static char seperate(char a,char b,char c){
        while(b==a || c==a) a++;
        return a;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	char s,e,in;
	System.out.println("-----A, B and C are the given rods----");
	System.out.print("Enter number of Plates: ");
	int n=x.nextInt();
	do{
	System.out.print("Enter character (A or B or C) of starting rod: ");
	s=Character.toUpperCase(x.next().charAt(0));
	if(s=='A' || s=='B' || s=='C') break;
	}while(true);
	do{
	System.out.print("Enter character (A or B or C) of ending rod  : ");
	e=Character.toUpperCase(x.next().charAt(0));
	if(e==s)
	System.out.println("Please Enter different character as it is starting character..!");
	else if(s=='A' || s=='B' || s=='C') break;
	}while(true);
	in=seperate('A',s,e);
	towerOfHanoi(n,s,e,in);
	}
}
