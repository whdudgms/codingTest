package BackJoon;

import java.util.Scanner;

public class B10813 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int buckets = sc.nextInt();
        int tran = sc.nextInt();
        int tmp = 0;
        int bnum1 = 0;
        int bnum2 = 0;
        String result= "";

        // 바구니 생성 바구니번호로 초기화한다
        int[] bucket = new int[buckets];

        for(int i = 0; i < bucket.length; i++){
            bucket[i] = i+1;
        }

        // 그 횟수만큼 읽는다
        for(int i = 0; i < tran; i++){
            bnum1 = sc.nextInt() -1;
            bnum2 = sc.nextInt() -1;
            tmp = bucket[bnum1];
            bucket[bnum1] = bucket[bnum2];
            bucket[bnum2] = tmp;
        }
        for(int i = 0; i < bucket.length; i++){
            result += bucket[i]+ " ";
        }
        System.out.println(result);
    }
}
