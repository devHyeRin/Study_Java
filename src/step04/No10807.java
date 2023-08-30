package step04;

import java.util.Scanner;

/* 10807번 : 개수세기
* 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
* */
public class No10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        int V = sc.nextInt();
        int count = 0;

        sc.close();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == V){
                count++;
            }
        }
        System.out.println(count);
    }
}
