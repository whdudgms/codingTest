package BackJoon;

import java.util.Scanner;

public class B3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cha = {1,1,2,2,2,8};
        int[] white = new int[6];
        String result = "";


       for(int i = 0; i < white.length; i++){
           white[i] = sc.nextInt();
           cha[i] -= white[i];
           result += cha[i] + " ";
       }
        System.out.println(result);

    }
}
