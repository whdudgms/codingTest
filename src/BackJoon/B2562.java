package BackJoon;

import java.util.Arrays;
import java.util.Scanner;

public class B2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] irr = new int[9];
        int[] irr2 = new int[9];
        int n = 0;
        for(int i = 0 ; i < 9; i++){
            irr2[i] = irr[i] = sc.nextInt();
        }
        Arrays.sort(irr2);

        for(int i = 0; i < 9; i++){
            if (irr[i] == irr2[8]) {
                n = i+1;
                break;
            }
        }



        System.out.println(irr2[8]);
        System.out.println(n);
    }
}
