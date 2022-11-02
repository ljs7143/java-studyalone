package ComputerLanguage.relay1.employeeTest;
import java.util.Scanner;

import ComputerLanguage.relay1.menus.MainMenuEnum;
import ComputerLanguage.relay1.menus.Menu;
import ComputerLanguage.relay1.menus.RegisterMenuEnum;

public class EmployeeTest {

	public static void main(String[] args) {
		Menu menu = new Menu();

		Scanner scanner = new Scanner(System.in);
		while(true) {
			MainMenuEnum mm = menu.MainMenu(scanner);
			if(mm == MainMenuEnum.REGISTER) {
				System.out.println("Register");
				while(true){
					RegisterMenuEnum rm = menu.RegisterMenu(scanner);
					if(rm == RegisterMenuEnum.FUllTIME ){
						
					}
				}
			}
			else if(mm == MainMenuEnum.SEARCH) {
				System.out.println("Search");
			}
			else if(mm == MainMenuEnum.EXIT) {
				System.out.print("Good BYE!");
				scanner.close();
				break;
			}
		}
		
		scanner.close();
	}
}
