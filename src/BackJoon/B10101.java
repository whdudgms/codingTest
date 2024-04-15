package BackJoon;

import java.util.Scanner;

public class B10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b + c != 180) {
            System.out.print("Error");
            return;
        }

        if(a == 60 && b == 60 && c == 60){
            System.out.print("Equilateral");
            return;
        }

        if(a == b && b == c && c == a){
            System.out.print("Isosceles");
            return;
        }


            System.out.print("Scalene");
            return;




    }
}
