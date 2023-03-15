/******************************************************************************

Make an skating track pattern for the given size integer....

Input:
5

Output:
a        a 
ab      ba
abc    cba 
abcd  dcba
abcdeedcba

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	char a=x.next().charAt(0);
	char s='A';
	int f=0;
	if(Character.isLowerCase(a)) f=1;
	s=Character.toLowerCase(s);
	while(s<=a){
	    char c='A';
	    if(f==1) c='a';
	    while(c<=s) System.out.print(c++);
	    while(c<=a){ System.out.print(" "); c++; }
	    c=a;
	    char e='A';
	    if(f==1) e='a';
	    while(c>s){ System.out.print(" "); c--; }
	    while(c>=e){ System.out.print(c--); }
	    s++;
	    System.out.println();
	}
	}
}
