package BackJoon;

import java.util.Scanner;

public class B2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        String str = "";
        String result = "";

        for (int i = 0; i < num; i++) {
            count = sc.nextInt();
            str = sc.next();
            for(int k = 0; k < str.length(); k++){
                for (int j = 0; j < count; j++){
                    result += str.charAt(k);
                }
            }
            System.out.println(result);
            result ="";
        }
    }
}
