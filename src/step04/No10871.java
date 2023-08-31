package step04;

import java.util.Scanner;

public class No10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        int[] A = new int[N];

        for(int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();

            if(A[i] < X)
                System.out.print(A[i] + " ");
        }
        sc.close();

        //배열을 사용하지 않는 방법
        /*
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < A.length; i++){
            int value = sc.nextInt();
            if(value < X){
                sb.append(value + " ");
            }
        }
        System.out.println(sb);
         */
    }
}
