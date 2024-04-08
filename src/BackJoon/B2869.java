package BackJoon;

import java.util.Scanner;

public class B2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int na = 0;
        int day = 0;

        day = x /(a-b);
        na = x /(a-b);


        if(na == 0){
            System.out.print(day);
        }

        if(na <= a){
            System.out.print(day +1);
        }

        if(na > a){
            System.out.print(day +2);
        }

        // day 1
//
//        while(he <= x){
//            day++;
//            he = he + a;
//            if (he >= x)
//                break;
//
//            he = he - b;
//        }


    }
}
