/******************************************************************************

Lambda function in java....

Input: lambda function

Output: It is lambda function 

*******************************************************************************/
import java.util.*;

interface lambda{
    public void print();
    public void print(int c,int d);
}

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String a=x.next(),b=x.next();
	lambda s1=(c,d)->{
	    System.out.print("It is "+c+" "+d);
	};
	lambda s2=()->{
	    System.out.print("It is "+a+" "+b);
	};
	s1.print();
	s1.print(5,8);
	}
}
