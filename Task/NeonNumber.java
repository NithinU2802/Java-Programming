/******************************************************************************

    Program to Check If a Number is Neon Number or Not.
    
    A neon number is a number where the sum of digits of the square of the number is
equal to the number. The task is to check and print neon numbers in a range.
    
Input  : 
9
Output : 
Neon number

Explanation : 
square of 9=9*9=81;
sum of digit of square : 8+1=9(which is equal to given number)


Input : 
8
Output : 
Not a Neon number
 
Explanation : 
square of 8=8*8=64
sum of digit of square : 6+4=10(which is not equal to given number)

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int c=0,t=n;
	n*=n;
	while(n>0){
        c+=n%10;
        n/=10;
	}
	if(t==c)
	System.out.println("Neon Number");
	else 
	System.out.println("Not a Neon Number");
	}
}
