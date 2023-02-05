/******************************************************************************

Switch available in java....

Input: 1
Output: Output

Input: 2
Output: Type 1 to get Output


*******************************************************************************/
import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
    Scanner x = new Scanner (System.in);
    int a = x.nextInt ();
    switch (a)
      {
      case 1:
	System.out.print ("Output");
	break;
	default:System.out.print ("Type 1 to get Output");

      }
  }
}
