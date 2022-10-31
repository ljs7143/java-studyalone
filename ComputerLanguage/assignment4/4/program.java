import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        while(true){
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            System.out.print(">>");
           
            sc.nextLine();
            if(s.equals("exit")){
                System.out.println("Exit.");
                break;
            }
            int len = s.length();
            StringBuilder sb = new StringBuilder();
            int random = (int)(Math.random()*len-2);
            for(int i = 0; i<len-1; i++){
                sb.append(s.charAt(i));
                if(i==random){
                    sb.append((char)((int)(Math.random()*26)+97));
                }
            }
            System.out.println(sb.toString());
        }
    }
}
