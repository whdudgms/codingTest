package BackJoon;

import java.util.Scanner;

public class B11653 {
    public static void main(String[] args) {
        //주어진 숫자를 (1과 자기 자신인 약수인)소수로 분해해서
        //결과값을 출력하는게 이번 문제에 포인트
        Scanner sc = new Scanner(System.in);

        //소수들로만 나눠야함!

        int num = sc.nextInt();
        while(true) {
            for (int i = 2; i <= num; i++) {
                if(num % i == 0){
                    num = num / i;
                    System.out.println(i);
                    break;
                }
            }
            if(num == 1)
                return;
        }


    }
}
