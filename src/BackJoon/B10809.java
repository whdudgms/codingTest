package BackJoon;

import java.util.Scanner;

public class B10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alpaNum = new int[26];
        String  vaca = sc.next();

        for(int i = 0; i < alpaNum.length;i++){
            alpaNum[i] = -1;
        }

        for(int i = 0; i < vaca.length(); i++){
            if(alpaNum[ vaca.charAt(i) - 97] == -1){
                alpaNum[ vaca.charAt(i) - 97] = i;
            }
        }
        String result = "";
        for(int i = 0; i < alpaNum.length;i++){
            result += alpaNum[i] + " " ;
        }
        System.out.println(result);
    }
}