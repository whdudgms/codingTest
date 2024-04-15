package BackJoon;

import java.util.Scanner;

public class B5073 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a == 0 && b == 0 && c== 0){
                return;
            }

            if (a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("Invalid");
                continue;
            }

            if (a == b && b == c && c ==a) {
                System.out.println("Equilateral");
                continue;
            }

            if (a == b || b == c || c ==a) {
                System.out.println("Isosceles");
                continue;
            }


            System.out.println("Scalene");


        }
    }
}
