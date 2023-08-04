/******************************************************************************

    Accessing super class attributes.

*******************************************************************************/

class Class1{
    String s="Nithin";
    public int age=20;
    void print(){
        System.out.println("This is class 1");
    }
}

class Class2 extends Class1{
 String name=super.s;
 void print(){
     System.out.println("Name: "+name);
     System.out.println("Age: "+age);
     super.print();
 }
}

public class Main
{
	public static void main(String[] args) {
	Class2 class2=new Class2();
	class2.print();
	}
}
