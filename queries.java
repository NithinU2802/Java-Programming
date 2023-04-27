/******************************************************************************

Consider an array A[] of integers and following two types of queries. 
 

update(l, r, x) : Adds x to all values from A[l] to A[r] (both inclusive).
printArray() : Prints the current modified array.
Examples : 
 

Input : 

1.Create an array
2.Update the given array
3.Print the array
4.Exit 

Number of queries: 6
Enter Choice:
1
Enter Array Size: 4
Enter Array:
10 5 20 40
Enter Choice:
2 
0 1 10
Enter Choice:
3 
Enter Choice:
2 
1 3 20
Enter Choice:
2 
2 2 30
Enter Choice:
3
        
Output : 20 35 70 60
         20 35 70 60

*******************************************************************************/

import java.util.*;

class Elements{
    private static int n;
    private int[] a;
    private List<int[]> list;
    Scanner x=new Scanner(System.in);
    
    public void create(){
        System.out.print("Enter Array Size: ");
        n=x.nextInt();
        a=new int[n];
        list=new ArrayList<>();
        for(int i=0;i<n;i++)
        a[i]=x.nextInt();
    }
    
    public boolean update(int s,int e,int d){
        try{
        for(int i=s;i<=e;i++)
        a[i]+=d;
        }catch(Exception ex){
            return false;
        }
        return true;
    }
    
    public void print(){
        list.add(a);
        System.out.print("\nElements are ");
        for(int i:a)
        System.out.print(i+" ");
        System.out.println("\n");
    }
    
    public void printArray(){
        for(int[] ar:list){
            for(int i=0;i<ar.length;i++)
            System.out.print(ar[i]+" ");
            System.out.println();
        }
    }
    
}

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int ch;
	System.out.println("1.Create an array\n2.Update the given array\n3.Print the array\n4.Exit\n");
	Elements a=new Elements();
	System.out.print("Enter Number of Queries: ");
	int q=x.nextInt(),c=0;
	do{
	   System.out.println("Enter Choice: ");
	   ch=x.nextInt();
	   int s,e,m;
	   switch(ch){
	       case 1:
	           a.create();
	           break;
	       case 2:
	           try{
	           s=x.nextInt();
	           e=x.nextInt();
	           m=x.nextInt();
	           if(!a.update(s,e,m))
	           System.out.println("Array index out of bound..!");
	           }catch(Exception ex){
	               System.out.println("Array Required...! ");
	           }
	           break;
	           
	       case 3:
	           try{
	           a.print();
	           }catch(Exception ex){
	               System.out.println("Array Required...! ");
	           }
	           break;
	       default:
	           System.out.println("Invalid Option");
	   }
	   c++;
	}while(c<q);
	a.printArray();
	}
}
