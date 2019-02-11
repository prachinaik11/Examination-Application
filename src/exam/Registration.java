package exam;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
class Registration {
	
	String filePath="f:students.txt";
	File file=new File(filePath);
	Scanner scanner = new Scanner(System.in);
	
	public int registrationInfo() throws IOException{
		
		UserID userId1=new UserID();

		System.out.println("Enter Username :");
		userId1.userName=scanner.nextLine();

		System.out.println("Enter password :");
		userId1.password=scanner.nextLine();		
		
		FileWriter fw=new FileWriter(file,true);

		PrintWriter pw = new PrintWriter(fw);

		pw.println();
		pw.print(userId1.userName+"|"+userId1.password);
		pw.close();
		fw.close();
		
		System.out.println("Registration Successful...!!!");
		
		return 1;		
	}
}
