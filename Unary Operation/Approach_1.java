/******************************************************************************

    Pre and post increament implementations

*******************************************************************************/

public class Approach_1
{
	public static void main(String[] args) {
	int c=5;
	while(true){
	    if(c--==0)
	        break;
	}
	int a = 5;  
    int b = 7;  
    c = 12;  
    int d = 15;  
    int x = ++a + ++b + ++c + ++d;   // Guess 43
    System.out.println(x);  
	System.out.println("Not stuck in the loop..!");
	}
}
