package step05;

import java.util.Scanner;

/* 2908번 : 상수
* 상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
* 상수는 수를 다른 사람과 다르게 거꾸로 읽는다.
* 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
* 두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
* */
public class No2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        sc.close();

        A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
        B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

        /*
        if(A > B)
            System.out.print(A);
        else
            System.out.print(B);
        */
        System.out.println(Math.max(A, B));
    }
}
