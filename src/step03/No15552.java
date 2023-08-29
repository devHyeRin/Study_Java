package step03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 모든 입력은 BufferedReader.readLine()으로 받기
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for(int i = 0; i < T; i++){
            // 문자열 분리를 위해서 반복마다 생성과 동시에 문자 입력받기
            st = new StringTokenizer(br.readLine(), " ");
            // 분리되어 있는 문자를 반환하며, 반환 타입은 String이므로 parseInt를 통해 int형 변환
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        br.close();

        bw.flush();  // 필수로 버퍼를 비운 뒤(flush) 닫아야 한다(close).
        bw.close();
    }
}
