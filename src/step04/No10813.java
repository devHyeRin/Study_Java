package step04;

import java.util.Scanner;

/* 10813번 : 공 바꾸기 */
public class No10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int M = sc.nextInt();

        int temp;

        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }

        for(int i = 0; i < M; i++){
            int I = sc.nextInt();
            int J = sc.nextInt();

            temp = arr[I-1];
            arr[I-1] = arr[J-1];
            arr[J-1] = temp;
        }

        for(int result : arr){
            System.out.print(result + " ");
        }
    }
}
