package step07;

import java.util.Scanner;

public class No2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];

        int max = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == max){
                    System.out.println(max);
                    System.out.println((i+1) + " " + (j+1));
                }
            }
        }

        /* 개선한 코드
        int max = 0;
        int x = 0, y = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j] > max){
                    max = arr[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((x+1) + " " + (y+1));
        */
    }
}
