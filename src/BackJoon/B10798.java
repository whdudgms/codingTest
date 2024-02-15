package BackJoon;

import java.util.Scanner;

public class B10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[5];
        for(int i = 0; i < 5; i++){
            str[i] = sc.nextLine();
        }

       for (int j= 0 ; j <15; j++) {
           for (int i = 0; i < 5; i++) {
               if(str[i].length()<=j)continue;
               System.out.print(str[i].charAt(j));
           }
       }
    }
}
