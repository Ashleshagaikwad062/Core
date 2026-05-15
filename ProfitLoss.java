package Core;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sb = new Scanner (System.in);
        System.out.println("Enter CP:");
        int cp = sb.nextInt();
        System.out.println("Enter SP:");
        int sp = sb.nextInt();
        if (cp>sp) System.out.println("Profit");
        if (cp<sp) System.out.println("Loss");
        if (cp==sp) System.out.println("Not Profit Not Loos");
    }
}