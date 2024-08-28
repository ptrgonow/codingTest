import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] n = new int[7];

        for (int i = 0; i < 7; i++) {
            n[i] = Integer.parseInt(r.readLine());
        }

        OptionalInt minOpt = Arrays.stream(n).filter(x -> x % 2 != 0).min();
        int sum = Arrays.stream(n).filter(x -> x % 2 != 0).sum();

        if (minOpt.isPresent()) {
            int min = minOpt.getAsInt();
            w.write(sum + "\n" + min + "\n");
        } else {
            w.write("-1");
        }





        w.flush();
        w.close();
        r.close();
    }
}
