package Core;
import.java.util.Scanner;
public class IsInteger{
    public static void main(){
        System.out.println("Enter Number:");
        Scanner sb  = new Scanner (System.in);
        double x = sb.nextDouble();
        int n = (int)x;
        if (x-n>0) System.out.println("is not integer");
        else System.out.println("is interger");
    }
}