import java.io.*;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = r.readLine().split(" ");
        long a = Long.parseLong(s[0]);
        long b = Long.parseLong(s[1]);

        long start = Math.min(a, b);
        long end = Math.max(a, b);

        if (start == end) {
            w.write("0\n");
        } else {
            long[] temp = LongStream.range(start + 1, end).toArray();
            long len = temp.length;

            w.write(len + "\n");
            for (long num : temp) {
                w.write(num + " ");
            }
        }

        w.flush();
        w.close();
        r.close();
    }
}