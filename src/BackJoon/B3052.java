package BackJoon;

import java.util.Arrays;
import java.util.Scanner;

public class B3052 {
    public static void main(String[] args) {
        // 42 로 어떤수들을 10번 나누고 각 수중에서 다른게 몇개인지 출력..

        int j= 0;
        int[] nums = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i =0; i < 10; i++) {
            nums[i] = sc.nextInt() % 42;
        }

        Arrays.sort(nums);

        for(int i =0; i < 9; i++) {
            if(nums[i] == nums[i+1])
                j++;
        }
        System.out.println(10-j);
    }
}
