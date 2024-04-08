package BackJoon;

import java.util.Scanner;

public class B11005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        int zin =  sc.nextInt();
        String result = "";
        while(num > 0){
            result = toZinNum(num % zin) + result;
            num /= zin;
        }

        System.out.print(result);
    }

    public static String toZinNum(int num){
        if(num <= 9){
            return num + "";
        } else{
            return ((char) ('A' + (num -10)))+"";
        }
    }

}
