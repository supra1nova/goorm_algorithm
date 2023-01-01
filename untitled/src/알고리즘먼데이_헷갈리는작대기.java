import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알고리즘먼데이_헷갈리는작대기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();

        String[] strArr = sentence.split("");

        int first = 0;
        int second = 0;
        int third = 0;
        int forth = 0;

        for(int i = 0; i < strArr.length; i++){
            if(strArr[i].equals("1")){
                first++;
            } else if(strArr[i].equals("I")) {
                second++;
            } else if(strArr[i].equals("l")){
                third++;
            } else if(strArr[i].equals("|")){
                forth++;
            }
        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(forth);
    }
}
