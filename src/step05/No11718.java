package step05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*11718번 : 그대로 출력하기
* 핵심 : 계속 입력을 받아야 한다. */
public class No11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        while((str = br.readLine()) != null){
            System.out.println(str);
        }
        br.close();
    }
}
