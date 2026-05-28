package Array;
import java.util.Arrays;
public class SortArray {
    public static void main(String[] args) {
        int[] arr ={ 98, 24, -1, 46, 36};
        print(arr);
        System.out.println("The Sorted Array is:");
          Arrays.sort(arr);
          print(arr);
           }
    public static void print(int[] arr) {
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
