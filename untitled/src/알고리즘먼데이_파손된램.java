import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알고리즘먼데이_파손된램 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] numArr = br.readLine().split(" ");
        int wrong = 0;
        String answer = "";

        for(int i = 0; i < count; i++){
            System.out.println("뭐여 : " + Integer.parseInt(numArr[i]));
            System.out.println("뭐여 : " + Math.sqrt(Integer.parseInt(numArr[i])));
            System.out.println("뭐여 : " + Math.log(Integer.parseInt(numArr[i])));
            System.out.println("뭐지 : " + Math.sqrt(Integer.parseInt(numArr[i])) % 1.0);
            if(Math.sqrt(Integer.parseInt(numArr[i])) % 1.0 != 0.0){
                wrong++;
                answer += " " + wrong;
            }
        }
        System.out.println(wrong);
        System.out.println(answer.trim());
    }
}
