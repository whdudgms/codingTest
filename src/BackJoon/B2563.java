package BackJoon;

import java.util.Scanner;

public class B2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int stPoint1 = 0;
        int stPoint2 = 0;
        boolean[][] flag = new boolean[100][100];

        int nums = sc.nextInt();

        for (int i = 0 ; i < nums; i++){
            stPoint1 = sc.nextInt() ;

            stPoint2 = sc.nextInt() ;

            for (int j = stPoint1; j < stPoint1+10; j++ ){
                for (int k = stPoint2; k < stPoint2+10; k++ ){
                    flag[j][k] = true;
                }
            }
        }

        for (int j = 0; j < 100; j++ ){
            for (int k = 0; k < 100; k++ ){
                if(flag[j][k] == true){
                    result++;
                }
            }
        }

        System.out.print(result);

    }
}
