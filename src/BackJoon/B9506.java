package BackJoon;

import java.util.Scanner;

public class B9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 1;
        StringBuilder sb = new StringBuilder();

        while (true) {
            num = sc.nextInt();
            if(num == -1)
                return;
            for(int i = 2; i < num; i++){
                if(num % i  == 0) {
                    sum +=i;
                    sb.append("+ " + i +" ");
                }
            }
            if(num == sum){
                System.out.println(num+" = 1 "+sb.toString());
            }else {
                System.out.println(num + " is NOT perfect.");
            }
            sum =1 ;
            sb = new StringBuilder();
        }


    }
}
