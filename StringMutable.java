/******************************************************************************

    Make string mutable in java.
    concept of stringbuilder and stringbuffer.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	StringBuffer bf=new StringBuffer();
	bf.append("Hello ");
	StringBuilder sf=new StringBuilder();
	sf.append("Hello ");
	bf.append("Nithin");
	sf.append("World");
	System.out.println(bf.toString());
	System.out.println(sf.toString());
	}
}
