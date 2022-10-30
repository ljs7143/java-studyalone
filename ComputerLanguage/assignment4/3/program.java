import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


public class program {
    public static void main(String[] args) throws IOException {
        System.out.println("Input a String!");

        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] arr = s.toCharArray();

        ArrayList<String> list = new ArrayList<>();
        

        String result = "";

        for(int i =0; i<s.length(); i++){
            list.add(String.valueOf(arr[i]));
            list.remove(String.valueOf(arr[0]));
            list.add(String.valueOf(arr[s.length()-1]));

            for(String item : list){
                result += item +"";
            }
            
        
            System.out.println(result);
        }
    }
}

