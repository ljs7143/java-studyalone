
import java.util.Scanner;

public class DicApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Kor-Eng dictionary program");

        Scanner sc = new Scanner(System.in);
        Dictionary dic = new Dictionary();
        while(true){
            System.out.println("korean word?");
            String word = sc.next();
            dic.kor2Eng(word);


            if(word.equals("stop")){
                break;
            }
            //여기서 메소드 호출 
        }

    }
    
}
