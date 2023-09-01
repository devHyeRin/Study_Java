package step04;

import java.util.Scanner;

/* 10810번 : 공 넣기
* 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
* 둘째 줄부터 M개의 줄에 걸쳐서 공을 넣는 방법이 주어진다. 각 방법은 세 정수 i j k로 이루어져 있으며,
* i번 바구니부터 j번 바구니까지에 k번 번호가 적혀져 있는 공을 넣는다.
* 예를 들어, 2 5 6은 2번 바구니부터 5번 바구니까지에 6번 공을 넣는다는 뜻
* 출력 : 1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력
* */
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
