package Core;
public class OutputInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // output
        //      int[] arr = {45, 56, 66, 76, 86, 96, 106};
        //    int n = arr.length;
        //  for (int i = 0; i < n; i++) {
        //    System.out.print(arr[i] + " ");
        //default values
        int[] ashu = new int[6];
        //for (int i = 0; i < 6; i++) {
        //  System.out.println(ashu[i] + " ");
        //  }
        //input
        for (int i = 0; i < 6; i++) {
            ashu[i] = sc.nextInt();
        }
        //print
        for (int i = 0; i < 6; i++) {
            System.out.print(ashu[i] + " ");
        }
    }
}