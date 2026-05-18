package Core;

import java.util.Scanner;

public class TernaryBasics {
    static void main() {
        Scanner sb = new Scanner (System.in);
        System.out.println("Enter Number");
        int n = sb.nextInt();
        System.out.println((n%2 ==0) ? "Even" :"Odd");
    }

}