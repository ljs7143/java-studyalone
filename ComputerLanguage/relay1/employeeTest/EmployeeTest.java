package ComputerLanguage.relay1;
import java.util.Scanner;
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
						System.out.println(">>> Fulltime Registration <<<");
					}
					else if(rm == RegisterMenuEnum.PARTTIME){
						System.out.println(">>> Parttime Registration <<<");
					}
					else if(rm == RegisterMenuEnum.BACK){
						break;
					}
				}
			}
			else if(mm == MainMenuEnum.SEARCH) {
				System.out.println("Search");
				while(true){
					SearchMenuEnum sm = menu.SearchMenu(scanner);
					if(sm == SearchMenuEnum.FUllSEARCH){
						System.out.println(">>> Full Search <<<");
					}
					else if (sm == SearchMenuEnum.BACK){
						break;
					}
				}
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

