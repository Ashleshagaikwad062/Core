package Core;
public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {23, 66, 74, 84, 73, 51, 44};
        int traget= 8;
        boolean flag = false;  // false means the value doesn't exist in array
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == traget) {
                flag = true; // true means value exist in array
                break;
            }
        }
            if(flag) System.out.println("target exit in array");
            else System.out.println("traget doesn't exist in array");
        }

    }