import java.io.*;
import java.util.Arrays;

public class 알고리즘먼데이_출석부 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] strArr = input.split(" ");
        int totalInt = Integer.parseInt(strArr[0]);
        int indexInt = Integer.parseInt(strArr[1]);
        String[] stringArr = new String[totalInt];
        for(int i=0; i<totalInt; i++){
            stringArr[i] = br.readLine();
        }
        Arrays.sort(stringArr);

        System.out.println(stringArr[indexInt-1]);
    }
}