/******************************************************************************

Scaler Martix....

Input : 2
        2 3 
        5 4
        k = 5
Output : 10 15 
         25 20 
We multiply 5 with every element.

Input : 3
        1 2 3 
        4 5 6
        7 8 9
        k = 4
Output :  4 8  12
          16 20 24
          28 32 36 

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int[][] a=new int[n][n];
	for(int i=0;i<n;i++)
	for(int j=0;j<n;j++) a[i][j]=x.nextInt();
	int k=x.nextInt();
	for(int i=0;i<n;i++){
	for(int j=0;j<n;j++) System.out.print((a[i][j]*k)+" ");
	System.out.println();
	}
	}
}
