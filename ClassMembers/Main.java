import java.lang.reflect.*;

public class Main {

    public static void main(String[] args) {
        try {
            // Replace 'ExampleClass' with the name of your class
            Class<?> clazz = ExampleClass.class;

            // Get and print all fields (variables) of the class
            Field[] fields = clazz.getDeclaredFields();
            System.out.println("Fields:");
            for (Field field : fields) {
                String modifier = Modifier.toString(field.getModifiers());
                System.out.println(" - " + field.getName() + " : " + field.getType().getName() + " (" + modifier + ")"); // Name, Return Type and Name
            }

            // Get and print all methods of the class
            Method[] methods = clazz.getDeclaredMethods();
            System.out.println("Methods:");
            for (Method method : methods) {
                String modifier = Modifier.toString(method.getModifiers());
                Class<?>[] parameterTypes = method.getParameterTypes();
                // Method Name
                System.out.print(" - " + method.getName() + " (");
                // Parameters of the methods
                for (int i = 0; i < parameterTypes.length; i++) {
                    System.out.print(parameterTypes[i].getName());
                    if (i < parameterTypes.length - 1) {
                        System.out.print(", ");
                    }
                }
                // Return Type and Modifiers
                System.out.println(") : " + method.getReturnType().getName() + " (" + modifier + ")"); 
            }

            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            System.out.println("Constructors:");
            for (Constructor<?> constructor : constructors) {
                String modifier = Modifier.toString(constructor.getModifiers());
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                // Constructor Name
                System.out.print(" - " + constructor.getName() + " (");
                // Parameters of the constructor
                for (int i = 0; i < parameterTypes.length; i++) {
                    System.out.print(parameterTypes[i].getName());
                    if (i < parameterTypes.length - 1) {
                        System.out.print(", ");
                    }
                }
                // Modifiers
                System.out.println(") (" + modifier + ")");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// Example class to reflect upon
class ExampleClass {
    private int id;
    private String name;

    public ExampleClass() {
    }

    public ExampleClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name,int a) {
        this.name = name;
    }
}
