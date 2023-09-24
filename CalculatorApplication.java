/******************************************************************************

    Calculator Application using Java

*******************************************************************************/
import java.util.*;

interface Calculator{
     int add(int a,int b);
     int subract(int a,int b);
     int multiple(int a,int b);
     int divide(int a,int b);
}

class Calci implements Calculator
{
    
    @Override
    public int add(int a,int b){
        return a+b;
    }
    
    @Override
    public int subract(int a,int b){
        return a-b;
    }
    
    @Override
    public int multiple(int a,int b){
        return a*b;
    }
    
    @Override
    public int divide(int a,int b){
        if(a==0)
            return -1;
        return a/b;
    }
}


class CalculatorApplication{
    public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int c=0;
	do{
	    System.out.print("Enter 1st Element: ");
	    int a=x.nextInt();
	    System.out.print("Enter 2st Element: ");
	    int b=x.nextInt();
	    Calci Calculator=new Calci();
	    System.out.println("\n1.Addition\n2.Subraction\n3.Multiplication\n4.Division\n5.Exit\n");
	    System.out.print("Choice: ");
	    c=x.nextInt();
	    int r=0;
	    switch(c){
	        case 1:
	            r=Calculator.add(a,b);
	            break;
	        case 2:
	            r=Calculator.subract(a,b);
	             break;
	        case 3:
	            r=Calculator.multiple(a,b);
	            break;
	        case 4:
	            r=Calculator.divide(a,b);
	            break;
	        case 5:
	            break;
	        default:
	            System.out.println("Invalid Option");
	    }
	    if(c>=1 && c<=4)
	        System.out.println("Result: "+r);
	    }while(c!=5);
	}
}
