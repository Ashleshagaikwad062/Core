package Core;
public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {32, 67, 83, 91, 44};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];  // it is to get largest element in array
        }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > smax && arr[i] != max) smax = arr[i];  // it is used to get second largest element in array
            }
            System.out.println(max);
            System.out.println(smax);
        }
    }