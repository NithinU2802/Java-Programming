/******************************************************************************

    Regex Implementations...!

*******************************************************************************/
import java.util.regex.*;
import java.util.*;

public class Find
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	Pattern p=Pattern.compile("Nithin");
	Matcher m=p.matcher(s);
	System.out.println(m.find());
	}
}
