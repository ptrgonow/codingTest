import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(r.readLine());
        String[] s = r.readLine().split(" ");
        int[] n = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
        
        // Y : t < 30s = 10
        int yre = Arrays.stream(n).map(t -> (t / 30 + 1) * 10).sum();
        // M : t < 60s = 15
        int mre = Arrays.stream(n).map(t -> (t / 60 + 1) * 15).sum();

        if (yre < mre) {
            w.write("Y " + yre + "\n");
        } else if (yre > mre) {
            w.write("M " + mre + "\n");
        } else {
            w.write("Y M " + yre + "\n");
        }

        w.flush();
        w.close();
        r.close();
    }
}