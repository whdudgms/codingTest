package BackJoon;

import java.util.Scanner;

public class B2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int papers = sc.nextInt();
        int[][] point = new int[100][100];

        int he;
        int br;
        for(int i =0; i < papers; i++){
            he = sc.nextInt();
            br = sc.nextInt();

            for(int j =0; j < 10; j++) {
                for(int k =0; k < 10; j++) {
                    point[he-1][br + k-1] = 1;
                }
                he++;
            }
        }
        int count =0;
        for(int j =0; j < 100; j++) {
            for(int k =0; k < 100; j++) {
                if(point[j][k] ==1)
                count++;
            }
        }
        System.out.println(count);
    }
}
