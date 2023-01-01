import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 알고리즘먼데이_구름크기측정하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(Arrays.stream(input.split(" ")).reduce((l, r) -> String.valueOf(Integer.parseInt(l) * Integer.parseInt(r))).get());
    }
}
