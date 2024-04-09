package BackJoon;

import java.util.Arrays;
import java.util.Scanner;

public class B1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = sc.nextInt();
        int y = sc.nextInt();

        int result;

        int[] arr = new int[4];
        arr[0] = a - 0;
        arr[1] = b - 0;
        arr[2] = Math.abs(a - x);
        arr[3] = Math.abs(b - y);

        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}
