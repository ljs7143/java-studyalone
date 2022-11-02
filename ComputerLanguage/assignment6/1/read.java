
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
 
public class read {
    public static void main(String[] args){
        try{
            System.out.println("Input your first file name >>");

            Scanner sc = new Scanner(System.in);
            String title = sc.next();
            //파일 객체 생성
            String folderPath ="";
            if(title.equals("elvis1.txt")){
                folderPath = "C:\\Users\\CKIRUser\\Downloads\\elvis1.txt";
            }
            if(title.equals("elvis2.txt")){
                folderPath = "C:\\Users\\CKIRUser\\Downloads\\elvis2.txt";
            }
           
            File file = new File(folderPath);
            //입력 스트림 생성
        
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        }catch (FileNotFoundException e) {
            // TODO: handle exception
        }
   
    }
  
}

