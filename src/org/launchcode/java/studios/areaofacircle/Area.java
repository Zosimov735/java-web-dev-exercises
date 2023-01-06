package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double radius;
        do {
            System.out.println("Enter the radius of a circle (it must be positive):");
            while(!input.hasNextDouble()){
                String newInput = input.nextLine();
                System.out.println("Invalid input, put in a number");
            }
            radius = input.nextDouble();
        } while(radius < 0);
        Double area = 3.14 * radius * radius;
        System.out.println(Circle.getArea(radius));
    }
}
