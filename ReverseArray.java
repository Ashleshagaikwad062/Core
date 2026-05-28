package Core;
public class ReverseArray {
    public static void main(String[] args) {

                int[] arr = {101, 33, 345, 6, -1, 999};

                int i = 0;
                int j = arr.length - 1;

                while (i < j) {

                    // Swap elements
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    i++;
                    j--;
                }

                // Print reversed array
                for (int num : arr) {
                    System.out.print(num + " ");
                }
            }
        }