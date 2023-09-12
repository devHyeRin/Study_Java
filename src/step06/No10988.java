package step06;

import java.util.Scanner;

/* 10988번 : 팰린드룸인지 확인하기
* 팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.
* 첫째 줄에 팰린드롬이면 1, 아니면 0을 출력한다.
* */
public class No10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);

        if(sb.toString().equals(sb.reverse().toString()))
            System.out.println("1");
        else
            System.out.println("0");
    }
}
