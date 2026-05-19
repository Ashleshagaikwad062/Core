package Core;
import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(i==1 || i==m || j==1 || j==n)
                System.out.print("* ");
                else System.out.println(" ");
            }
            System.out.println();
        }
    }
}