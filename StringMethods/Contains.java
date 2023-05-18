/******************************************************************************

          A string is created by using another string's letters. Letters are case
sensitive. Write a Java program that checks the letters of the second string are
present in the first string. Return true otherwise false.

Input: 
Java 
Ja

Output:
true

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine(),a=x.nextLine();
	System.out.print(s.contains(a));
	}
}
