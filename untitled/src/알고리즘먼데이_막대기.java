import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알고리즘먼데이_막대기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String totalNumStr = br.readLine();
        int[] intArr = new int[Integer.parseInt(totalNumStr)];
        for(int i = 0; i < intArr.length; i++){
            intArr[i] = Integer.parseInt(br.readLine());
        }
        int maxInt = 0;
        int count = 0;
        for(int i = intArr.length-1; i >= 0; i--){
            if(maxInt < intArr[i]){
                maxInt = intArr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
