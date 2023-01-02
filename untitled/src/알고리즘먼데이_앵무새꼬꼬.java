import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알고리즘먼데이_앵무새꼬꼬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lineNum = Integer.parseInt(br.readLine());
        String[] strArr = new String[lineNum];
        for(int i = 0; i < lineNum; i++){
            strArr[i] = br.readLine().replaceAll("(?i)[^aeiou]", "");
        }
        for(int i = 0 ; i < lineNum; i++){
            if(strArr[i].equals("")){
                strArr[i] = "???";
            }
            System.out.println(strArr[i]);
        }
    }
}
