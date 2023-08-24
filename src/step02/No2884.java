package step02;

import java.util.Scanner;

/* 2884번 : 알람 시계
* 45분 일찍 알람 설정하기 -> 상근이가 설정한 알람 시간이 주어졌을 때 창영이의 방법을 사용해서 언제로 알람을 고쳐야하는지 구하는 프로그램 작성하기
* ex ) 10 10 입력 -> 9 25 출력
* */
public class No2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        sc.close();

        if(M < 45){
            H--;
            M = 60 - (45 - M);
            if(H < 0){    // 시간이 음수가 되면
                H = 23;
            }
            System.out.println(H + " " + M);
        }
        else{
            System.out.println(H + " " + (M - 45));
        }

    }
}
