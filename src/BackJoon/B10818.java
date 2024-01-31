package BackJoon;

import java.util.Arrays;
import java.util.Scanner;

public class B10818 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] irr = new int[count];
        for(int i = 0; i < count; i++) {
            irr[i] = sc.nextInt();
        }
        Arrays.sort(irr);
        String result = irr[0]+" "+irr[count-1];
        System.out.println(result);
    }
}
