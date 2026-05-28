package Core;
import java.util.Scanner;

public class PrintNegativeElement {
     public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         System.out.println("Enter Array Size:");
         int n = sc.nextInt();
         int[] arr = new int[n];
         System.out.println("Enter Array Elements:");
         for (int i=0;i<n;i++)
         arr[i] = sc.nextInt();
         System.out.println("The Negative Number is:");
        for (int i=0;i<n;i++)
          if (arr[i]<0) System.out.println(arr[i]+" ");
     }
}
