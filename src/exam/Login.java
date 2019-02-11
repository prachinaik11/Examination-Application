package exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
class Login {
	String filePath="f:students.txt";
	String temporaryPassword;
	File file=new File(filePath);
	Scanner scanner = new Scanner(System.in);
	
	public int loginInfo() throws FileNotFoundException{
		
		@SuppressWarnings("resource")
		Scanner s1 = new Scanner(file);
		HashMap<ArrayList<String>, ArrayList<String>> idPassword = new HashMap<>(); 
		ArrayList<String> userNameArrayList = new ArrayList<>();
		ArrayList<String> passwordArrayList = new ArrayList<>();
		
		UserID userId1=new UserID();
		System.out.println("LOGIN:");
		System.out.println("Username: ");
		userId1.userName = scanner.nextLine();
		System.out.println("Password: ");
		userId1.password = scanner.nextLine();
		
		while(s1.hasNextLine())
		{	
			UserID userId=new UserID();
			String Line=s1.nextLine();			
			String[] token = Line.split("\\|");
			userId.setUserName(token[0]);
			userId.setPassword(token[1]);	
			userNameArrayList.add(token[0]);
			passwordArrayList.add(token[1]);			
		}
		
		idPassword.put(userNameArrayList, passwordArrayList);		
		
		int index;
		if(userNameArrayList.contains(userId1.userName))
		{
			index=userNameArrayList.indexOf(userId1.userName);
			if(userId1.password.equals(passwordArrayList.get(index)))
			{
				return 1;
			}
			else 
			{
				System.out.println("Wrong Password ...!!!");
				return 0;
			}
		}
		else 
		{
			System.out.println("Invalid User...!!!");
			return 0;
		}
	}

}
