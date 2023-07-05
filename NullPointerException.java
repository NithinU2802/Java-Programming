/******************************************************************************

    Write a Java program to create a class called "Dog" with a name and breed 
attribute. Create two instances of the "Dog" class, set their attributes using the constructor 
and modify the attributes using the setter methods and print the updated values.

*******************************************************************************/
import java.util.*;

class Dog{
    private String name;
    private int age;
    
    void setName(String name){
        this.name=name;
    }
    
    void setAge(int age){
        this.age=age;
    }
    
    String getName(){
        return name;
    }
    
    int getAge(){
        return age;
    }
    
}

class Main{
    
	public static void main(String[] args){ 
	Scanner x=new Scanner(System.in);
	System.out.print("Enter Count: ");
	int n=x.nextInt();
	x.nextLine();
	Dog[] dog=new Dog[n];
	
	for(int i=0;i<n;i++){
	    System.out.print("Enter Dog Name "+(i+1)+": ");
	    String s=x.next();
	    x.nextLine();
	    dog[i].setName(s);
	    System.out.print("Enter Age: ");
	    int d=x.nextInt();
	    x.nextLine();
	    dog[i].setAge(d);
	}
	
	System.out.println("\nDatabase:");
	for(int i=0;i<n;i++){
	    System.out.println("Dog "+(i+1)+" Name: "+dog[i].getName());
	    System.out.println("Age: "+dog[i].getAge());
	    System.out.println();
	}
	
	}
}
