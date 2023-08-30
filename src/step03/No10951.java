package step03;

import java.util.Scanner;

/*
* 10951번
* 입력의 종료 시점을 알아야 한다.
* 입력의 종료 시점은 더이상 읽을 수 있는 데이터가 (EOF)가 없을 때 종료
* */
public class No10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()){
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A+B);
        }
        sc.close();
    }
}
