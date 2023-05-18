/******************************************************************************

        Write a Java program that removes a specified word from given text. Return
the updated string..

Input: 
Exercises Practice Solution
Solution

Output:
Exercises Practice 

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String[] s=x.nextLine().split(" ");
	String a=x.nextLine(),r="";
	for(String i:s)
	if(!i.equals(a)) r+=i+" ";
	System.out.println(r);
	}
}
