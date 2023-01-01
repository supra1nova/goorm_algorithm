import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알고리즘먼데이_의좋은형제 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arrStr = str.split(" ");
        int front = Integer.parseInt(arrStr[0]);
        int back = Integer.parseInt(arrStr[1]);
        int day = Integer.parseInt(br.readLine());
        for(int i = 1; i <= day; i++){
            if(i % 2 != 0){
                if(front % 2 == 0){
                    back += front/2;
                    front -= front/2;
                } else{
                    back += front/2 + 1;
                    front -= front/2 + 1;
                }
            } else{
                if(back % 2 == 0){
                    front += back/2;
                    back -= back/2;
                } else{
                    front += back/2 + 1;
                    back -= back/2 + 1;
                }
            }
        }
        System.out.printf("%d %d", front, back);
    }
}
