import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알고리즘먼데이_뱀이지나간자리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int front = Integer.parseInt(strArr[0]);
        int back = Integer.parseInt(strArr[1]);
        for(int i = 0; i < front; i++){
            for(int j = 0; j < back; j++){
                if( i % 2 == 0){
                    System.out.print("#");
                } else if(i % 4 == 1){
                    if(j == back-1){
                        System.out.print("#");
                    } else{
                        System.out.print(".");
                    }
                } else{
                    if(j == 0){
                        System.out.print("#");
                    } else{
                        System.out.print(".");
                    }
                }
            }
            System.out.println();
        }
    }
}
