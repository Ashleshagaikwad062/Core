package Core;

import java.util.Scanner;

public class TernaryVariable {
    static void main() {
        Scanner sb = new Scanner (System.in);
        System.out.println("Enter Number:");
        int n = sb.nextInt();
        int Ashu = (n>=0) ? 100 : 0;
        System.out.println(Ashu);
    }
}
