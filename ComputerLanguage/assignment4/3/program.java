import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class program {
    public static void main(String[] args) throws IOException {
        System.out.println("Input a String!");

        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] arr = s.toCharArray();
        for(int i =0; i<s.length(); i++){

            //여기만 뜯어고치면 됨 
            for(int j=1; j<s.length(); j++){
                sb.append(arr[j]);
                // 한칸씩 당기고 한칸씩 밀어내야함
                // for(int k =0; k<j; k++){
                //     sb.append(arr[k]);
                // }    
            }
            String result = sb.toString();
            System.out.println(result);
        }
    }
}
