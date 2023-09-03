package step04;

import java.util.Scanner;

/* 1546번: 평균 구하기
*  세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다.
* 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
* 예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
* 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
* */
public class No1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] arr = new double[N];

        double max = 0;
        double sum = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextDouble();

            if(arr[i] > max){
                max = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++){
            sum += (arr[i]/max) * 100;
        }
        System.out.println(sum/arr.length);
    }
}
