/******************************************************************************

Regex implementation with methods....

Input:
String 
Stringcontain

Output:
String found 

Input:
String 
Integercontain

Output:
String not found 

*******************************************************************************/

import java.util.*;
import java.util.regex.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	String c=x.nextLine();
	Pattern in=Pattern.compile(s);
	Matcher m=in.matcher(c);
	if(m.find()) System.out.println("String found");
	else System.out.println("String not found");
	}
}
