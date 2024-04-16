package BackJoon;

import java.util.Arrays;
import java.util.Scanner;

public class B14215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] irr = new int[3];
        int result = 0;

        for (int i = 0; i < irr.length; i++) {
            irr[i] = sc.nextInt();
        }

        Arrays.sort(irr);
        if (irr[0] + irr[1] > irr[2]) {
            System.out.println(irr[0] + irr[1] + irr[2]);
        }else{
            System.out.println((irr[0] + irr[1]) *2 -1);
        }
    }
}
