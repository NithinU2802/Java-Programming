/******************************************************************************

     Write a Java program to compare a given string to a specified string buffer
     
Input:
one 
one 

Output: 
Normal String: true 
Buffered String: false
ContentEquals Method: true

Input:
two 
too 

Output: 
Normal String: true 
Buffered String: false
ContentEquals Method: false

*******************************************************************************/

import java.util.*;


public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine(),p=x.nextLine();
	StringBuffer a=new StringBuffer(s);
	StringBuffer b=new StringBuffer(p);
	System.out.println("Normal String: "+s.equals(p));
	System.out.println("Buffered String: "+a.equals(b));
	
	// object must be string and value pass which is buffered value...!
	System.out.println("ContentEquals Method : "+s.contentEquals(b));
	}
}
