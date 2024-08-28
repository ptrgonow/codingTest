import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] n = new int[9];
        for (int i = 0; i < 9; n[i++] = Integer.parseInt(r.readLine()));
        int max = Arrays.stream(n).max().getAsInt();
        int index = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] == max) {
                index = i + 1;
                break;
            }
        }

        w.write(max + "\n" + index + "\n");

        w.flush();
        w.close();
        r.close();
    }
}
