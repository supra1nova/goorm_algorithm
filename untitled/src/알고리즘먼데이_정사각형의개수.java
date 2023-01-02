import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class 알고리즘먼데이_정사각형의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numStr = br.readLine();
        BigInteger total = BigInteger.ZERO;
        for(int i = 1; i <= Integer.parseInt(numStr); i++){
            total = total.add(BigInteger.valueOf((long)Math.pow(i, 2)));
        }
        System.out.println(total);
    }
}
