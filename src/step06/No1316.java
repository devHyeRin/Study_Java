package step06;

import java.util.Scanner;

/* 1316번 : 그룹 단어 체커
* 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
* ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
* aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
* 단어는 알파벳 소문자로만 되어있고 중복되지 않는다.
* */
public class No1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;   // 그룹 단어 개수 카운트

        for(int i = 0; i < N; i++){
            String str = sc.next();   // 단어 입력 받기
            boolean[] check = new boolean[26];  // 알파벳 사용 체크
            boolean word = true;    // 그룹 단어인지 아닌지
            for(int j = 0; j < str.length(); j++){
                int index = str.charAt(j) - 'a';
                if(check[index] && str.charAt(j) != str.charAt(j-1)){  // 이전에 사용했고, 이전 문자와 연속되지 않을 경우
                    word = false;  // 그룹 단어가 아님
                    break;

                }
                else{   // 이전에 사용한 적 없는 경우
                    check[index] = true;   // 문자 사용 체크
                }
            }
            if(word)
                count++;
        }
        System.out.println(count);
    }
}
