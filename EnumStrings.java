/******************************************************************************

    Enum Strings usage in java.

*******************************************************************************/

enum Student {
    Nithin, Aslam, Sujan, Subash
}

public class Main {
    public static void main(String[] args) {
        // Accessing enum constants
        System.out.println("Enum constant Nithin: " + Student.Nithin);
        System.out.println("Enum constant Aslam: " + Student.Aslam);
        System.out.println("Enum constant Sujan: " + Student.Sujan);
        System.out.println("Enum constant Subash: " + Student.Subash);

        // Converting enum constants to string
        System.out.println("String value of Nithin: " + Student.Nithin.toString());
        System.out.println("String value of Subash: " + Student.Subash.name());

        // Iterating through all enum constants
        System.out.println("All Students:");
        for (Student student : Student.values()) {
            System.out.println(student);
        }

        // Switch-case with enums
        Student selectedStudent = Student.Nithin;
        switch (selectedStudent) {
            case Nithin:
                System.out.println("Nithin selected");
                break;
            case Aslam:
                System.out.println("Aslam selected");
                break;
            case Sujan:
                System.out.println("Sujan selected");
                break;
            case Subash:
                System.out.println("Subash selected");
                break;
            default:
                System.out.println("Unknown student selected");
        }
    }
}



