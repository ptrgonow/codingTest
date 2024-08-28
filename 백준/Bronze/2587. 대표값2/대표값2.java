import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] n = new int[5];

        for (int i = 0; i < 5; i++) {
            n[i] = Integer.parseInt(r.readLine());
        }
        Arrays.sort(n);
        int sum = Arrays.stream(n).sum();
        int avg = sum / 5;
        int mid = n[2];

        w.write(avg + "\n" + mid + "\n");

        w.flush();
        w.close();
        r.close();
    }
}
