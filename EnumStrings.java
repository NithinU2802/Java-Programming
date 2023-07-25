/******************************************************************************

    Enum Strings usage in java.

*******************************************************************************/

enum Student {
   Nithin, Aslam, Sujan, Subash
}

class Main {
   public static void main(String[] args) {

    System.out.println("string value of SMALL is " + Student.Nithin.toString());
    System.out.println("string value of MEDIUM is " + Student.Subash.name());

   }
}


