package BackJoon;

import java.util.Scanner;

public class B2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result = 0;
        String[] rep = {"dz=","c=","c-"
        ,"d-","lj","nj","s=","z="};

        for (int i =0; i< rep.length; i++){
           str = str.replaceAll(rep[i],"A");
            System.out.println(str);
        }


        result = str.length();
        System.out.println(result);
    }

}
