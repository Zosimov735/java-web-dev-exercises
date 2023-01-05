package exercises;
import java.util.Scanner;

public class calculateArea {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of a rectangle:");
        Integer length = input.nextInt();
        System.out.println("Enter the width of the rectangle:");
        Integer width = input.nextInt();

        int area = length * width;

        System.out.println("Here is the area: " + area);
    }
}
