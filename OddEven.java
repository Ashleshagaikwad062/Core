package Core;

import java.util.Scanner;

public class OddEven {
    static void main() {
        System.out.println("Enter the Number");
        Scanner ag = new Scanner(System.in);
        int n = ag.nextInt();
        if (n%2 == 0) System.out.println("Even Number");
        else System.out.println("Odd Number");
    }
}
