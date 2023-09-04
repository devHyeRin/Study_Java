package step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 2743번 : 단어 길이 재기
* 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
* 풀이 방법 : 입력 -> BufferedReader 사용
* */
public class No2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();

        br.close();

        System.out.println(word.length());
    }
}
