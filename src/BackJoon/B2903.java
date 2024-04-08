package BackJoon;

import java.util.Scanner;

class B2903{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int z = sc.nextInt();
        int sq = 3;
        int k = 0;

        for(int i=1; i < z; i++ ){
            k =  k + (i * 2);
        }

        System.out.print( (sq+k)*(sq+k));
    }
}