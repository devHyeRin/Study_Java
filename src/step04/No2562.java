package step04;

import java.util.Scanner;

/* 2562번 : 최댓값 */
public class No2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];

        int max = 0;
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();

            if(arr[i] > max){
                max =  arr[i];
                index = i + 1;
            }
        }
        System.out.print(max + "\n" + index);
    }
}
