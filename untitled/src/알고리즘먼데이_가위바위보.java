import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알고리즘먼데이_가위바위보 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();
        String[] strArr = sentence.split(" ");
        int first = 0;
        int second = 0;
        int third = 0;
        for(int i = 0; i < strArr.length; i++){
            if(strArr[i].equals("1")){
                first++;
            } else if(strArr[i].equals("2")){
                second++;
            } else {
                third++;
            }
        }
        if(first > 0 && second > 0 && third > 0){
            System.out.println(0);
        } else if(first > 0 && third > 0){
            System.out.println(first);
        } else if(first > 0 && second > 0){
            System.out.println(second);
        } else if(second > 0 && third > 0){
            System.out.println(third);
        } else {
            System.out.println(0);
        }
    }
}
