package BackJoon;

import java.util.Scanner;

public class B5086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0) {
                return;
            }
            if((b % a) ==0){
                System.out.println("factor");
                continue;
            }
            if ((a % b) == 0) {
                System.out.println("multiple");
                continue;
            }
            System.out.println("neither");

        }

    }
}
