/******************************************************************************

provide types of lamba expressions....

type0 -> Zero Parameter
type1 -> Single Parameter
type2 -> Multiple Parameter

Input:
CSE 
3rd Year

Output:
HI!... CSE 3rd Year

Input:
CSE 
2rd Year

Output:
HI!... CSE 2rd Year



NOTE: It is not possible to make multiple default abstract class on single interface
Hence we use seperate interfaces to learn types.


*******************************************************************************/
import java.util.*;

   
interface details0{
   void type0();
}

interface details1{
   void type1(String a);
}

interface details2{
   void type2(String a,String b);
}

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String dpt=x.nextLine();
	String[] yr=x.nextLine().split(" ");
	details0 d0;
	details1 d1;
	details2 d2;
	d2=(String a,String b)->System.out.print(a+" "+b);
	d0=()->System.out.print("HI!... ");
	d1=(String a)->System.out.print(a+" ");

	d0.type0();
	d1.type1(dpt);
	d2.type2(yr[0],yr[1]);
	}
}
