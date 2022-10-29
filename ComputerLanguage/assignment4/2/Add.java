import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Add {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        // String result = s.replaceAll("||s", "");
        // int sum=0;
        // String[] forresult = result.split("||+",0);
        // for(int i =0; i<forresult.length; i++){
        //     sum = sum+Integer.valueOf(forresult[i]);
        // }
        int sum = 0;
        //StringTokenizer st = new StringTokenizer(."+ ")
        String[] change = s.split(" ");
        for(int i=0; i<change.length; i++){
            if(!change[i].equals("+")){
                int foradd = Integer.valueOf(change[i]);
                sum = sum + foradd;
            }
        }
        System.out.println("Result is " + sum);
    }
}
