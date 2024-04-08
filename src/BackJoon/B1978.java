package BackJoon;

import java.util.Scanner;

public class B1978 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int hit = sc.nextInt();
        int num = 0;
        int result = 0;
        boolean flag = false;

        for(int i = 0; i < hit; i++) {
            num = sc.nextInt();
            if(num ==1)
                continue;
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                result++;
            }
            flag = false;
        }
        System.out.println(result);
    }
}
