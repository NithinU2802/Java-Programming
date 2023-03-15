/******************************************************************************

Triangle Pattern implementation based on integer input......

Input:
6

Output:
     A 
    BAB
   CBABC
  DCBABCD
 EDCBABCDE
FEDCBABCDEF

Input:
4

Ouput:
   A 
  BAB 
 CBABC 
DCBABCD 



*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt(),f=0;
	char k='A';
	for(int i=0;i<n;i++){
	    for(int j=0;j<n-1-i;j++) System.out.print(" ");
	    char t=k;
	    while(t>='A'){ System.out.print(t); t--; }
	    t='B';
	    while(t<=k){ System.out.print(t); t++; }
	    k++;
	    System.out.println();
	}
	}
}
