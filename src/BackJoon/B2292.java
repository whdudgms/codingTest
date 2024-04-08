package BackJoon;

import java.util.Scanner;

public class B2292 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1){
            System.out.println(1);
            return; }


        int i = 1;
        int count = 1;
        while(i < n ){
            i += count*6;
            count++;
        };
        System.out.println(count);
    }
}
