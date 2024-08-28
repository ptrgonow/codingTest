import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] n = new int[9];

        for (int i = 0; i < 9; i++) {
            n[i] = Integer.parseInt(r.readLine());
        }

        int[] result = new int[7];

        firstLoop:
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                int[] temp = new int[7];
                int index = 0;

                for (int k = 0; k < 9; k++) {
                    if (k != i && k != j) {
                        temp[index++] = n[k];
                    }
                }

                int sum = 0;
                for (int height : temp) {
                    sum += height;
                }

                if (sum == 100) {
                    result = temp;
                    break firstLoop;
                }
            }
        }

        Arrays.sort(result);
        for (int height : result) {
            w.write(height + "\n");
        }

        w.flush();
        w.close();
        r.close();
    }
}
