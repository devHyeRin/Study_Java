package step06;

import java.util.Scanner;

/* 2941번 : 크로아티아 일파벳
* 예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다.
* 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
* 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
* */
public class No2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String st = sc.nextLine();

        for(int i = 0; i < str.length; i++){   // 변환할 문자 있는지 검사하기 위한 반복문
            if(st.contains(str[i]))   // contains() : 배열에 있는 원소가 사용자가 입력한 st 문자열에 있는지 검사하는 함수
                                      // 예를 들어, "c="이 st 문자열에 있으면 true가 리턴
                st = st.replace(str[i], "!");    // replace() : str[i]를 "!"로 변환하는 함수
        }
        System.out.println(st.length());
    }
}
