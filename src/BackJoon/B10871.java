package BackJoon;

import java.util.Scanner;

public class B10871 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();         //10
        int compare = sc.nextInt();     // 4
        String result = "";
        int bucket;

        for (int i = 0;i < num; i++){
            bucket = sc.nextInt();
             if(compare > bucket)
                 result += (bucket+" ");
        }
        System.out.println(result);
    }
}
