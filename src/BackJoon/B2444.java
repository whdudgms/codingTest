package BackJoon;

import java.util.Scanner;

public class B2444 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cha = 0;
        for(int i = 1 ; i <= 2*n-1; i++){
            cha = Math.abs(i - n);
            for(int j = 0; j< cha ; j++){
                System.out.print(" ");
            }
            for(int k = 0; k< n*2-1-cha*2 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
