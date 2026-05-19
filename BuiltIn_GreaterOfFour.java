package Core;

import java.util.Scanner;

public class BuiltIn_GreaterOfFour {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number a:");
        double a = sc.nextDouble();
        System.out.print("Enter Number b:");
        double b = sc.nextDouble();
        System.out.print("Enter Number c:");
        double c = sc.nextDouble();
        System.out.print("Enter Number d:");
        double d = sc.nextDouble();

        double greatest = Math.max(Math.max(a, b), Math.max(c, d));
        System.out.println("Maximum number: " + greatest);


    }
}
