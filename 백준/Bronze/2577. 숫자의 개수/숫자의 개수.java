import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int c = Integer.parseInt(r.readLine());

        int m = a * b * c;
        String s = String.valueOf(m);

        int n0 = 0;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;

        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '0':
                    n0++;
                    break;
                case '1':
                    n1++;
                    break;
                case '2':
                    n2++;
                    break;
                case '3':
                    n3++;
                    break;
                case '4':
                    n4++;
                    break;
                case '5':
                    n5++;
                    break;
                case '6':
                    n6++;
                    break;
                case '7':
                    n7++;
                    break;
                case '8':
                    n8++;
                    break;
                case '9':
                    n9++;
                    break;
            }
        }

        w.write(n0 + "\n" + n1 + "\n" + n2 + "\n" + n3 + "\n" + n4 + "\n" + n5 + "\n" + n6 + "\n" + n7 + "\n" + n8 + "\n" + n9);

        w.flush();
        w.close();
        r.close();
    }
}
