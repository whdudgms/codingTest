package BackJoon;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class B5597 {
    public static void main(String[] args) {
        int[] resultNum = new int[2];
        int j =0;
        Scanner sc = new Scanner(System.in);
        // 28개의 번호 입력 // 2줄의 출력
        int[] num = new int[30];
        //배열을 인덱스 처럼 활용해서 풀까?

        for(int i = 0;i < 28; i++){
            num[sc.nextInt()-1]++;
        }
        for(int i = 0;i < 30; i++){
            if(num[i] == 0)
                resultNum[j++] = i+1;
        }
        Arrays.sort(resultNum);
        System.out.println(resultNum[0]);
        System.out.println(resultNum[1]);
    }
}
