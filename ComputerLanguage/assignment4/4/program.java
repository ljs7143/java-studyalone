import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.print(">>");
            String s = sc.nextLine();
            if(s.equals("exit")){
                System.out.println("Exit.");
                break;
            }
            int len = s.length();
            StringBuilder sb = new StringBuilder();
            int random = (int)(Math.random()*len-1);
            for(int i = 0; i<len; i++){
                sb.append(s.charAt(i));
                if(i==random){
                    sb.append((char)((int)(Math.random()*26)+97));
                }
            }
            System.out.println(sb.toString());
       
            
        }
    }
}
