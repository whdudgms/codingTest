package BackJoon;

import java.util.Arrays;
import java.util.Scanner;

public class B3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];

        for (int i = 0; i < 3; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1[0] == arr1[1]){
            System.out.print(arr1[2]+ " ");
        }else {
            System.out.print(arr1[0]+ " ");
        }

        if(arr2[0] == arr2[1]){
            System.out.print(arr2[2]);
        }else {
            System.out.print(arr2[0]);
        }
    }
}
