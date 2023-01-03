import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알고리즘먼데이_거울단어 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] strArr = new String[count];
        for(int i = 0; i < count; i++){
            strArr[i] = br.readLine();
        }
        for(int i = 0; i < count; i++){
            if(strArr[i].contains("b") || strArr[i].contains("d") || strArr[i].contains("p") || strArr[i].contains("q") || strArr[i].contains("s") || strArr[i].contains("z")){
                strArr[i] = "Mirror";
            } else{
                strArr[i] = "Normal";
            }
            System.out.println(strArr[i]);
        }
    }
}
