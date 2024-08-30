import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        // 컬렉션 (List) 쓰려면 레퍼 클래스 필요함 (IntStream 은 int 로 받아서 -> Integer boxing)
        List<Integer> cards = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList());

        // index balancing (인덱스 0 에서 시작)
        for (int i = 0; i < 10; i++) {
            String[] input = r.readLine().split(" ");
            int a = Integer.parseInt(input[0]) - 1;
            int b = Integer.parseInt(input[1]);
            Collections.reverse(cards.subList(a, b));
        }

        for (int card : cards) {
            w.write(card + " ");
        }

        w.flush();
        w.close();
        r.close();
    }
}