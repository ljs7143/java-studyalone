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
            if(forkey.equals("exit")){
                System.out.println("Exit the program");
                break;
            }
            if(map1.containsKey(forkey)==true){
                int existedone = map1.get(forkey);
                map1.put(forkey, val+existedone);
            }
            else{
                map1.put(forkey, val);
            }
            map1.forEach((key,value) ->{
                System.out.println("("+ key + "," +value+")");
            });
        }
    }
}
