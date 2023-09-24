package step07;

import java.util.Scanner;

public class No10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] arr = new char[5][15];   // 문자 넣을 배열

        for(int i = 0; i < arr.length; i++){
            String input = sc.next();

            for(int j = 0; j < input.length(); j++){
                arr[i][j] = input.charAt(j);
            }
        }
        sc.close();

        for(int i = 0; i < 15; i++){
            for(int j = 0 ; j < 5; j++){
                if(arr[j][i] == '\0')   // null 문자 체크
                    continue;
                System.out.print(arr[j][i]);
            }
        }
    }
}
