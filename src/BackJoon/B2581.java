package BackJoon;

import java.util.Scanner;

public class B2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int min = -1;
        int sum = 0;
        boolean result = true;

        for (int i = num1; i <= num2; i++) {
            if(i ==1)
                continue;
            if(i == 2){
                min = i;
                sum += i;
                result = true;
                continue;
            }
            // i 의 값이 소수인지 검사하는 로직
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    result = false;
                    break;
                }
            }
            if(result){
                if(min == -1){
                    min = i;
                }
                sum += i;
            }
            result = true;
        }
        if(min != -1) {
            System.out.println(sum);
            System.out.println(min);
        }else{
            System.out.println(min);
        }
    }
}
