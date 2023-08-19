package org.launchcode;
import studios.areaofacircle.Circle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a radius: ");
        double radius = scanner.nextDouble(); // Use the appropriate data type (double) for radius


        double area = Circle.getArea(radius);


        System.out.println("The area of a circle of radius " + radius + " is: " + area);


        scanner.close();
    }
}