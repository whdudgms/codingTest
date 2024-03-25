package BackJoon;

import java.util.Scanner;

public class B2745 {
    public static void main(String[] args) {

        //숫자와 진법이 주어진다

        Scanner sc = new Scanner(System.in);
        String num = sc.next(); //  숫자
        int zin = sc.nextInt(); // 진수
        int result = 0;


        for (int i = 0 ; i < num.length(); i++){
            result +=   zimTox(num.charAt(i)) ;
            if(i <num.length()-1)
            result *=   zin;
        }
        System.out.println(result);
    }

    public static int zimTox(char su){
        if('A' <= su && su <= 'Z'){
            return su - 'A' +10;
        }
        return su - '0';
    }
}
