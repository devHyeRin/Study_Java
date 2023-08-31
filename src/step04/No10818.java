package step04;

import java.util.Arrays;
import java.util.Scanner;

public class No10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);       // 배열에 저장된 값 오름차순 정렬 메소드
        System.out.println(arr[0] + " " + arr[N-1]);
    }
}
