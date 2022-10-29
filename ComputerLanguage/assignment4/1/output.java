import java.util.Scanner;
import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;


public class output {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        while(true){
            // String sentence = sc.next();
            // String[] arr = sentence.split(" ");
            // int count = arr.length;

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str = reader.readLine();
            String[] arr = str.split(" ");
            int count = arr.length;


            System.out.println("The number of words is "+count);

            if(str.equals("exit")){
        
                break;
            }
        }
        System.out.println("Exit");
    }  
}
