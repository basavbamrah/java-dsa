import java.util.Arrays;
import java.util.Scanner;

public class ArraysBasic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Arrays
        // datatype[] var_name = new datatype[size]
        int[] arr = new int[5];
        // or
        // int[] arr2 = { 1, 2, 3, 4, 5 };

        // // declaration
        // int[] ros;
        // // initialization
        // ros = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
