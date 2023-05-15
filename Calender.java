/******************************************************************************

    Print time and date using calender class available in java
    
Output:
" Current Time and Date "

*******************************************************************************/

import java.util.*;


public class Main
{
	public static void main(String[] args) {
	Calendar c=Calendar.getInstance(TimeZone.getTimeZone("Asia/Kolkata"));
	System.out.format("%tB %te %tY%n",c,c,c);
	System.out.format("%tl:%tM:%tp%n",c,c,c);
	}
}


/*
we can change time based on the conditions as TimeZone object alteration 
*/
