package step05;

import java.util.Scanner;

/* 10809번 : 알파벳 찾기
* 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
* 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
* */
public class No10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // -1로 된 알파벳 갯수26개 배열 생성
        int[] arr = new int[26];
        for(int i = 0; i < arr.length; i++){
            arr[i] = -1;
        }

        String S = sc.nextLine();

        for(int i = 0; i < S.length(); i++){
            char ch = S.charAt(i);

            if(arr[ch - 'a'] == -1){   // arr 원소 값이 -1인 경우에만 초기화
                arr[ch - 'a'] = i;
            }
        }

        for(int result : arr){
            System.out.print(result + " ");
        }
    }
}
