package java.Day3_for;

import java.io.*;

public class q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine().trim());

        for(int i=N; i>=1; i-- ){
            bw.write(i+"\n");
        }
        bw.flush();
        bw.close();
    }
}
