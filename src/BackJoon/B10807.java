package BackJoon;

import java.util.Scanner;

import java.io.*;
import java.util.StringTokenizer;

public class B10807 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());;

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int b = Integer.parseInt(br.readLine());

        for(int j = 0; j < arr.length; j++){
            if(b == arr[j]) {
                count++;
            }
        }
        System.out.println(count);

        br.close();
        bw.flush();
        bw.close();
    }
}

// 이문제를 그냥 Scanner로 풀었지만 BufferReader를 사용하면 훨씬 시간단축이 된다. 이풀이를 보고 공부해서 내 풀이로 만들자.