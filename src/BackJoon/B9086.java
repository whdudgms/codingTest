package BackJoon;

import java.util.Scanner;

public class B9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums = sc.nextInt();
        String result = "";
        String str= "";

        for(int i = 0; i < nums; i++){
            str = sc.next();
            result += str.charAt(0) +""+ str.charAt(str.length()-1) + "\n";
        }

        System.out.println(result);
    }

}



