package Java_Practice;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("n = ");
        int n = sc.nextInt();
        if (n > arr.length) {
            System.out.println("INVALID !!!");
            System.exit(1);
        }

        // Using another array
        int[] new_arr = new int[arr.length];
        int temp_i = 0;
        for (int i = 0; i < arr.length; i++) {
            temp_i = i + n >= arr.length ? i + n - arr.length : i + n;
            new_arr[temp_i] = arr[i];
        }
        for (int element : new_arr) {
            System.out.print(element + " ");
        }
    }
}
