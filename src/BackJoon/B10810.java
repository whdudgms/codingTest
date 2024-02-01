package BackJoon;

import java.util.Arrays;
import java.util.Scanner;

public class B10810 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int buckets = sc.nextInt();
        int counts = sc.nextInt();
        int[] bucket = new int[buckets];
        String result = "";
        Arrays.fill(bucket, 0);

        int from = 0;
        int to = 0;
        int num = 0;

        for(int i = 0; i < counts; i++){
            from = sc.nextInt();
            to = sc.nextInt();
            num = sc.nextInt();
            for(int k = from-1; k < to; k++){
                bucket[k] = num;
            }
        }

        for(int i = 0;i < bucket.length; i++) {
            result += (bucket[i]+ " ");
        }
        System.out.println(result);
    }
}
