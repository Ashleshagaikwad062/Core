package Core;
import java.util.Scanner;
public class AbsoluteValue {

    static void main() {
        System.out.println("Enter the value:");
        Scanner demo = new Scanner (System.in);
        int n = demo.nextInt();
        if (n< 0) n = -n;
        System.out.println(n);
    }
}
