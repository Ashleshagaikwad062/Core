package Core;
public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {13, -6, 78, 99, 3, 44, 23};
        int max =arr[0]; // instead of arr[0] we can use Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] > max) max = arr[i]; // it means how to get maximum value of array
        }
            System.out.println(max);
    }
}