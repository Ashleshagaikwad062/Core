package Core;

public class MissingElementInArray {
    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 5};

        int missing = missingNum(arr);

        System.out.println("Missing number is: " + missing);
    }

    public static int missingNum(int arr[]) {
        long n =  100;
        long sum = n * (n + 1) / 2;
        long arraysum = 0;
        for (int ele : arr) {
            arraysum += ele;
        }
        return (int) (sum - arraysum);
    }
}