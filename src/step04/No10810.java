package step04;

import java.util.Scanner;

public class No10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // N번 바구니
        int[] arr = new int[N];
        int M = sc.nextInt();   // 공 넣는 횟수

        for(int i = 0; i < M; i++){
            int I = sc.nextInt();    // I부터
            int J = sc.nextInt();    // J까지 바구니
            int K = sc.nextInt();    // 어떤 숫자를 넣을지

            for(int j = I - 1; j < J; j++){
                arr[j] = K;
            }
        }

        for(int result : arr){
            System.out.print(result + " ");
        }


    }
}
