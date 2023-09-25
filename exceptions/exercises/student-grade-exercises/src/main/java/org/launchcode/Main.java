package org.launchcode;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("Result of division: " + Divide(10, 2));

        try {
            System.out.println("Result of division: " + Divide(10, 0));
        } catch (ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        for (Map.Entry<String, String> entry : studentFiles.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Points: " + CheckFileExtension(entry.getValue()));
        }
    }

    public static int Divide(int x, int y) {
        try {
            if (y == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }
            return x / y;
        } catch (ArithmeticException e) {
            throw e;
        }
    }

    public static int CheckFileExtension(String fileName) {
        try {
            if (fileName == null || fileName.isEmpty()) {
                throw new IllegalArgumentException("File name is null or empty.");
            }

            if (fileName.endsWith(".java")) {
                return 1;
            } else {
                return 0;
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
