package step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 9086번 : 문자열
* 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오
* */
public class No9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            String str = br.readLine();
            System.out.print(str.charAt(0));
            System.out.println(str.charAt(str.length()-1));
        }
        br.close();

    }
}
