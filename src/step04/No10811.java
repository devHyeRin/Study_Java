package step04;

import java.util.Scanner;

/* 10811번 : 바구니 뒤집기
* 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
* 둘째 줄부터 M개의 줄에는 바구니의 순서를 역순으로 만드는 방법이 주어진다
* 도현이는 입력으로 주어진 순서대로 바구니의 순서를 바꾼다.
* */
public class No10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 바구니 개수
        int M = sc.nextInt();   // 바구니 역순 정렬 횟수

        int[] arr = new int[N];   // 바구니 배열

        // 바구니 초기화
        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 1;     // 1부터 N까지 초기화
        }

        // 바구니 역순 정렬
        for(int i = 0; i < M; i++){
            int I = sc.nextInt() - 1;  // 배열 0부터 시작
            int J = sc.nextInt() - 1;

            while (I < J){
                int temp = arr[I];
                arr[I++] = arr[J];
                arr[J--] = temp;
            }
        }
        sc.close();

        for(int result : arr){
            System.out.print(result + " ");
        }
    }
}
