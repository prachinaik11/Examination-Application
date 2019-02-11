package exam;

import java.io.IOException;
import java.util.Scanner;

class UserID {
	
	String userName, password;
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	
	Scanner scanner = new Scanner(System.in);
	public int getInfo() throws IOException {
		
		
		System.out.println("1.LOGIN 2.REGISTER\nEnter choice :");
		int choice = 0;
		choice=scanner.nextInt();
		
		
		switch(choice){
		
		case 1 :Login login1=new Login();
				return login1.loginInfo();

			
		case 2 :Registration registration1=new Registration();
				registration1.registrationInfo();
				return 1;
			
		
	}
		return 0;
	}
}
		
