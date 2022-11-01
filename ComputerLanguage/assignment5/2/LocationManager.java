import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;
public class LocationManager {

    public static void main(String[] args) {
        
        System.out.println("Input city name,longitude,latitude");
        HashMap<String, Location> map1=new HashMap<String, Location>();
       
       
        for(int i =0; i<4; i++){
            System.out.print(">>");
            Scanner sc = new Scanner(System.in);
            String forkey = sc.next();
            String lat = sc.next();
            String lon = sc.next();
            Location loc = new Location(lat, lon);
            map1.put(forkey, loc);
        }

        System.out.println("-----------------------------");
        for (Entry<String, Location> entrySet : map1.entrySet()) {
            System.out.println(entrySet.getKey() + "    " + entrySet.getValue());
        }

        System.out.println("------------------------------------");
        while(true){
            System.out.print("City Name? >>");
            Scanner sc = new Scanner(System.in);
            String searchkey = sc.next();

            if(map1.containsKey(searchkey)==true){
                System.out.println(searchkey +"    " + map1.get(searchkey) );

            }else if(searchkey.equals("stop")){
                    break;

            }else{
                System.out.println(searchkey + "  does not exists.");
            
            }
        }
    }
}
