import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 알고리즘먼데이_단어의개수세기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();

//        // 맨 아래 한줄과 같은 코드
//        int total = 0;
//        String[] strArr = sentence.split(" ");
//        for(int i = 0; i < strArr.length; i++){
//            if(!strArr[i].equals("")){
//                total++;
//            }
//        }
//        System.out.println(total);

        System.out.println(Arrays.stream(sentence.split(" ")).filter(i -> !i.equals("")).count());
    }
}
