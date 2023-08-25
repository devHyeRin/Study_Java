package step03;

import java.util.Scanner;

public class No10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] arr = new int[T];

        for(int i = 0; i < T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            arr[i] = A + B;
        }
        sc.close();

        for(int result : arr){
            System.out.println(result);
        }
    }
}
