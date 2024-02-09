package BackJoon;

import java.util.Scanner;

public class B11720 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);


        int nu = sc.nextInt();
        String nums = sc.next();
        int result = 0;
        for(int i = 0; i < nu; i++){
            result += (int)nums.charAt(i) -48;
        }
        System.out.println(result);

    }
}
