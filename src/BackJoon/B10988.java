package BackJoon;

import java.util.Scanner;

public class B10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        int result = 1;

        for(int i = 0; i < len/2; i++){
            if(str.charAt(i)!= str.charAt(str.length()-1-i)){
                result =0;
            }
        }
        System.out.println(result);
    }
}
