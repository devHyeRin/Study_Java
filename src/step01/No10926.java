package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
* 10926번 : ??!
* 준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다. 준하는 놀람을 ??!로 표현한다.
* 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 놀람을 표현하는 프로그램을 작성하시오.
* 출력 : 첫째 줄에 준하의 놀람을 출력한다. 놀람은 아이디 뒤에 ??!를 붙여서 나타낸다.
* ex) joonas 입력 -> joonas??! 출력
*
* 첫번째 실패 : 이미 아이디가 주어져있고 그 문자열과 맞으면 출력해야하는 것이라고 문제를 이해해서 틀렸다.....
* 그냥 단순하게 문자열 입력받고 그 문자열 뒤에 `??!` 을 출력하면 되는 것이었다...!
*
* */
public class No10926 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//
//        String id = "joonas";
//        String idCheck = "??!";
//
//        String idInput = sc.nextLine();
//        if(idInput.equals(id)){
//            System.out.println(id + idCheck);
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String idCheck = "??!";

        String str = br.readLine();
        System.out.println(str + idCheck);

    }
}
