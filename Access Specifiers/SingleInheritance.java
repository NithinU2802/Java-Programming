/******************************************************************************

    Single Inheritance in java..

*******************************************************************************/

import java.util.*;

class Single{
    public static int a;
    void print(int a){
        System.out.println(a);
    }
}

public class Main extends Single
{
	public static void main(String[] args) { 
	Single single =new Single();
	Scanner x=new Scanner(System.in);
	a=x.nextInt();
	single.print(a);
	}
}
