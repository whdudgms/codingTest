package BackJoon;

import java.util.Arrays;
import java.util.Scanner;

public class B2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 9;
        int m = 9;
        int[][] vs = new int[2][2];
        int[][] nm = new int[n][m];

        for(int i = 0; i < nm.length; i++){
            for(int j = 0; j < nm.length; j++){
                nm[i][j] = sc.nextInt();
            }
        }


        for(int i = 0; i < nm.length; i++){
            for(int j = 0; j < nm.length; j++){
                if(vs[0][0] < nm[i][j]){
                    vs[0][0] = nm[i][j];
                    vs[1][0] = i;
                    vs[1][1] = j;
                }
            }
        }
        System.out.println(vs[0][0]);
        System.out.print(vs[1][0]+1 + " ");
        System.out.print(vs[1][1]+1 + " ");
    }
}
