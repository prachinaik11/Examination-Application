package exam;

import java.io.IOException;

public class ExamDriver {
	public static void main(String...prachi) throws IOException{ //args is not compulsary ,it can be anything
	//args can b anything such as name, number,etc	
		UserID user1=new UserID();
		if(user1.getInfo()==1)
		{
		WelcomeUser w1=new WelcomeUser();
		w1.welcomeUser1();
		}
		
	}

}
