package step03;

import java.util.Scanner;

/* 2379번 : 구구단
* N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오.
* N*1부터 N*9까지 출력한다.
* */
public class No2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sc.close();

        for(int i = 1; i < 10; i++){
            System.out.println(N + " * " + i + " = " + (N*i));
        }
    }
}
