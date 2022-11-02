package ComputerLanguage.relay1.menus;

public enum RegisterMenuEnum {
    FUllTIME(11, "Registration of Full-Time Employees"),
    PARTTIME(12, "Registraion of Part-Time Employees"),
    BACK(19, "Back");

    int code;
	
    String message;
	
    RegisterMenuEnum(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getMessage() {
		return message;
	}

    
}
