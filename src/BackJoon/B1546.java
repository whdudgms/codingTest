package BackJoon;

import java.util.Arrays;
import java.util.Scanner;

public class B1546 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int nums = sc.nextInt();

        int[] scores = new int[nums];
        double result = 0;

        for(int i = 0; i < scores.length; i++){
            scores[i] = sc.nextInt();
        }

        Arrays.sort(scores);


        System.out.println(Arrays.toString(scores));

        for(int i = 0; i < scores.length; i++){
            result += (scores[i]/(double)scores[nums-1])*100;
            System.out.println("result = "  +result);
        }


        System.out.println(result/nums);

    }
}
