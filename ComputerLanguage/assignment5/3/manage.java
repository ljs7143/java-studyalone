import java.util.HashMap;
import java.util.Scanner;

public class manage {
    public static void main(String[] args) {
        System.out.println("** Point Management System **");
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map1=new HashMap<String, Integer>();
        while(true){
            System.out.print("Input your name and point>>");
            String forkey = sc.next();
            int val = sc.nextInt();
            map1.put(forkey, val);
            System.out.println();
        }
    }
    
}
