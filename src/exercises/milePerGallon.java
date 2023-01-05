package exercises;
import java.util.Scanner;
public class milePerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles you have driven: ");
        Double miles = input.nextDouble();
        System.out.println("Enter the number of gallons of gas you've used: ");
        Double gas = input.nextDouble();
        double mpg = miles/gas;
        System.out.println("Your MPG is: " + mpg);
    }
}
