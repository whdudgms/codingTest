package BackJoon;

import java.util.Arrays;
import java.util.Scanner;

public class B10811 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int buckets = sc.nextInt();
        int tran = sc.nextInt();
        int from = 0;
        int to = 0;
        String result = "";

        int[] bucket = new int[buckets];


        for (int i = 0; i < bucket.length; i++){
            bucket[i] = i+1;
        }

        for (int i = 0; i < tran; i++){
            from = sc.nextInt();
            to = sc.nextInt();
            reverse(bucket, from, to);
        }

        for (int i = 0; i < buckets; i++){
            result += bucket[i]+" ";
        }

        System.out.println(Arrays.toString(bucket));
        System.out.println(result);
    }

    public static int[] reverse( int[] bucket,int from, int to){
        int tmp = 0;

        while(from < to){
            tmp = bucket[from-1];
            bucket[from-1] = bucket[to-1];
            bucket[to-1] = tmp;

            from++;
            to--;
        }
        return bucket;
    }
}
