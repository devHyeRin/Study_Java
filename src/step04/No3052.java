package step04;

import java.util.Scanner;

public class No3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int temp = 0;
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt() % 42;
        }
        for(int i = 0; i < arr.length; i++){
            temp = 0;
            for(int k = i + 1; k < 10; k++){
                if(arr[i] == arr[k])
                    temp++;
            }
            if(temp == 0)
                count++;
        }
        System.out.println(count);
    }
}
