package step05;

import java.util.Scanner;
import java.util.StringTokenizer;

/* 1152번 : 단어의 개수
* 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
* 첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
* 단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.
* */
public class No1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        sc.close();

        // st에 공백을 기준으로 나눈 토큰들을 저장
        StringTokenizer st = new StringTokenizer(S, " ");

        // countToken() : 토큰의 개수 반환
        System.out.println(st.countTokens());
    }
}
