import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
public class height {
    public static void main(String[] args) {
        System.out.println("Input a child's height for 10 years!");
        System.out.print(">>");
        Scanner sc = new Scanner(System.in);
        Vector<Integer> V = new Vector<Integer>();
        for(int i = 0; i<10; i++){
            int height = sc.nextInt();
            V.add(height);
        }
        ArrayList<Integer> num = new ArrayList<Integer>();
        for(int i=1; i<10; i++){
            int gap = V.get(i) - V.get(i-1);
            num.add(gap);
        }
        int forindex = Collections.max(num);
        int index = num.indexOf(forindex)+2010;
        double max = (double)Collections.max(num);
        System.out.println("The year the child grow the most was  " +(index) +"      "+ max+"cm");
    }
}
