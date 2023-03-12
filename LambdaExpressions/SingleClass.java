/******************************************************************************

Implement Lamba Expression in a single class...

Input:
2 3

Output:
Addition and Multiplication
5
6

Input:
2 25

Output:
Addition and Multiplication
27
50

Interfaces and class for make Multiple operation....


*******************************************************************************/
import java.util.*;

public class Main
{
    interface opt{
        int operation(int a,int b);
    }
    
    void print(int a,int b,opt o){
        System.out.println(o.operation(a,b)); 
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int a=x.nextInt(),b=x.nextInt();
	System.out.println("Addition and Multiplication");
	opt add=(int c,int d)->c+d;
	opt mul=(int c,int d)->c*d;
	Main m=new Main();
	m.print(a,b,add);
	m.print(a,b,mul);
	}
}
