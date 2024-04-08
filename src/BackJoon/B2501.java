package BackJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class B2501 {
    public static void main(String[] args) {
        // K번째로 작다?
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // 어떤수의 약수를 구하는 공식이 있을까?
        // 하나씩 수를 올려가면서 계산해보는 것은 어떨까? 그냥 주먹구구식인거지

        ArrayList irr = new ArrayList();
        for (int i = 1; i <= num1; i++){
            if(num1 % i  == 0) {
                irr.add(i);
            }
        }
        Object[] arr = irr.toArray();
        if(arr.length < num2){
            System.out.println("0");
            return;
        }
        System.out.println(arr[num2-1]);


    }
}
