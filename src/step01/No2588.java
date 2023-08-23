package step01;

import java.util.Scanner;

/*2588Q번 : 곱셈*/
public class No2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String b = sc.next();

        sc.close();


        System.out.println(a * (b.charAt(2) - '0'));
        System.out.println(a * (b.charAt(1) - '0'));
        System.out.println(a * (b.charAt(0) - '0'));
        System.out.println(a * Integer.parseInt(b));

        /* 다른 방법
        int c = sc.nextInt();
        int d = sc.nextInt();

        sc.close();

        System.out.println(c * (d%10));
        System.out.println(c * (d%100/10));
        System.out.println(c * (d/100));
        System.out.println(c * d);
        */
    }
}
