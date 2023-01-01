import java.io.*;

public class 알고리즘먼데이_철자분리집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String inputStr = br.readLine();

        int amount = 0;
        for(int i = 0 ; i < inputStr.split("").length; i++){
            if(i > 0){
                if(!inputStr.split("")[i].equals(inputStr.split("")[i-1])){
                    amount++;
                }
            } else{
                amount++;
            }
        }
        System.out.println(amount);
    }
}