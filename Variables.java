import java.io.*;

class Variables {
    public static void main(String[] args) {
        // Local variable in Variables class
        int age;
        age = 85;

        System.out.println("I am " + age + " years old");

        // Local variable in main method
        int var = 10;

        // This variable is local to this main method only
        System.out.println("Local Variable: " + var);
    }
}
