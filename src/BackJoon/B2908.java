package BackJoon;

import java.util.Scanner;

public class B2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        String reNum1 = "";
        String reNum2 = "";

        for(int i = 2; i >= 0 ;i--){
            reNum1 += num1.charAt(i);
            reNum2 += num2.charAt(i);
        }
        int re1 =  Integer.valueOf(reNum1);
        int re2 = Integer.valueOf(reNum2);
        if(re1 > re2){
            System.out.print(re1);
        }else{
            System.out.print(re2);
        }


    }
}
