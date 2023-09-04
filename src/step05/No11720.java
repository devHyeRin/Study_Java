package step05;

import java.util.Scanner;

/* 11720번 : 숫자의 합
* N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
* */
public class No11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String str = sc.next();

        sc.close();

        int sum = 0;
        for(int i = 0; i < N; i++){
           sum += str.charAt(i) - '0';   // charAt() 은 해당 문자의 아스키코드 값을 반환
                                         // 반드시 -48 또는 '0'을 해주어야 우리가 입력받은 숫자 값 그대로 사용 가능
        }
        System.out.println(sum);
    }
}
