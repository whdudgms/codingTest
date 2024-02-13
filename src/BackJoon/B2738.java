package BackJoon;

import java.util.Scanner;

public class B2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // N 행 M 열
        // 2번입력 ~~

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] gg = new int[n][m];

        // 이 for문에 요소를 2차원 배열에 저장한다
        // 이걸 두번 반복하고 각 요소를 출력한다
        for(int i = 0; i < gg.length; i++){
            for(int j = 0; j < gg[0].length; j++){
                gg[i][j]  += sc.nextInt();
            }
        }

        for(int i = 0; i < gg.length; i++){
            for(int j = 0; j < gg[0].length; j++){
                gg[i][j]  += sc.nextInt();
                System.out.print(gg[i][j] + " ");
            }
            System.out.println();
        }


    }
}
