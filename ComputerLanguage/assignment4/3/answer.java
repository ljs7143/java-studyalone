import java.util.Scanner;


public class ref {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a String!");
        String s = sc.nextLine();
        int len = s.length();
        for(int i=0; i<len; i++){
            String first = s.substring(0,1);
            String last = s.substring(1);
            s= last+first;
            System.out.println(s);
        }
        
    }

   
}
