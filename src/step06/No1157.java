package step06;

import java.util.Scanner;

/* 1157번 : 단어 공부
* 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
* 단, 대문자와 소문자를 구분하지 않는다.
* 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
* 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
* */
public class No1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];   // 영문자(A ~ Z) 확인

        String str = sc.next();
        str = str.toUpperCase();    // 대소문자 구분하지 않으므로 모두 대문자로 변경

        for(int i = 0; i < str.length(); i++){
            arr[str.charAt(i) - 'A']++;    // 해당 인덱스 값 증가
            // 입력 문자열 'A'일 경우 : 'A' - 'A' = 65 - 65 = 0 -> arr[0] 값 증가
        }

        int max = -1;
        char result = '?';
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
                result = (char)(i + 'A');     // 대문자로 출력해야하므로
            }
            else if(max == arr[i]){
                result = '?';
            }
        }
        System.out.println(result);

    }
}
