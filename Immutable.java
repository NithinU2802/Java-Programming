/******************************************************************************

    Java elements are consist of objects which can be delibratly changelabe as some 
elements will not need to support to modify the change it quality or elements said 
to be immutable.

<--- Some objects which are immutable are Wrapper class, String class mainly with 
    Primitive objects used in java --->

Eg:
Set are immutable in java...!

    As it can store the elements which in sorted order but cannot change order
or make update over middle or combine operations....!

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Set<Integer> a=new HashSet<>();
	Set<Integer> b=new HashSet<>();
	a.add(23);
	a.add(3);
	b.add(45);
	b.add(56);
    //	System.out.print(a+b);
    System.out.println(a); //sorted 
	}
}
