package step06;

import java.util.Scanner;

/* 3003번 : 킹, 퀸, 룩, 비숍, 나이트, 폰
* */
public class No3003 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        // 기본 셋팅된 피스 개수
        int[] defaultCount = {1,1,2,2,2,8};
        // 사용자로부터 입력 받은 흰색 피스 개수 담을 배열
        int[] whiteCount = new int[6];

        // 사용자 입력받기
        for(int i = 0; i < whiteCount.length; i++){
            whiteCount[i] = sc.nextInt();
        }
        sc.close();

        // 피스 개수 차이 및 출력
        for(int i = 0; i < defaultCount.length; i++){
            int difference = defaultCount[i] - whiteCount[i];
            System.out.print(difference + " ");
        }
    }
}
