
import java.util.Arrays;

import java.util.Scanner;

public class PhoneBook {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Number of person to store");
        int howmany = sc.nextInt();
        Phone[] singlePerson = new Phone[howmany];
       
        for(int i=0; i<howmany; i++){
            System.out.println(" Name and Tel. NO.>>");
            String itname = sc.next();
            String ittel = sc.next();
            singlePerson[i] = new Phone(itname, ittel);
        }
        System.out.println("Saved");

        while(true){
            System.out.println("who do you wanna search for?");
           
            int nocount = 0; 

            String target = sc.next();

            
            for(int i =0; i<singlePerson.length; i++){
               
                if(singlePerson[i].name.equals(target)){
                    System.out.println(target + "'s telephone no. is "+ singlePerson[i].tel); 
                }
                if(!singlePerson[i].name.equals(target)){
                    nocount++;
                    continue;
                }
               
            }
            if(nocount == singlePerson.length){
                System.out.println(target + " does not exist ");
            }
            if(target.equals("stop")){
                break;
            }
        }
    }
}

