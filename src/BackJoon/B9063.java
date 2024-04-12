package BackJoon;

import java.util.Arrays;
import java.util.Scanner;

public class B9063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        long[] x = new long[num];
        long[] y = new long[num];

        if(num ==1){
            System.out.println(0);
            return;
        }

        for(int i = 0; i < num; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        Arrays.sort(x);
        Arrays.sort(y);

         System.out.println((x[x.length-1]- x[0])  *(y[y.length-1]- y[0]));
    }
}
