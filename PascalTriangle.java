/******************************************************************************

    Implementation of pascal triangle for the given Integer.
    
Input:
5

Output:
    1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1 


Input:
8

Output:
        1 
       1 1 
      1 2 1 
     1 3 3 1 
    1 4 6 4 1 
   1 5 10 10 5 1 
  1 6 15 20 15 6 1
 1 7 21 35 35 21 7 1

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int[][] pascal=new int[n+n][n+n];
	int k=n,l=n;
	for(int i=0;i<n;i++){
	    if(i==0)
	    pascal[i][k]=1;
	    else{
	        pascal[i][k]=1;
	        pascal[i][l]=1;
	        int j=i-1;
	        int p=k+2,q=l-2;;
	        while(p<=q){
	            pascal[i][p]=pascal[i-1][p-1]+pascal[i-1][p+1];
	            p+=2;
	        }
	    }
	    k--;
	    l++;
	}
	
	for(int i=0;i<n;i++){
	    for(int j=0;j<n+n;j++){
	        if(pascal[i][j]==0)
	            System.out.print(" ");
	        else 
	            System.out.print(pascal[i][j]);
	    }
	    System.out.println();
	}
	
	}
}
