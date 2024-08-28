import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 3; i++) {
            String yut = r.readLine().replace(" ", "");
            int bae = 0;

            for (char c : yut.toCharArray()) {
                if (c == '0') {
                    bae++;
                }
            }

            char result;
            switch (bae) {
                case 0: // 모
                    result = 'E';
                    break;
                case 1: // 도
                    result = 'A';
                    break;
                case 2: // 개
                    result = 'B';
                    break;
                case 3: // 걸
                    result = 'C';
                    break;
                case 4: // 윷
                    result = 'D';
                    break;
                default:
                    result = 'X';
                    break;
            }

            w.write(result + "\n");
        }

        w.flush();
        w.close();
        r.close();
    }
}
