package exam;

import java.io.FileNotFoundException;
import java.util.Scanner;

class WelcomeUser {
	Scanner scanner = new Scanner(System.in);

	public void welcomeUser1() throws FileNotFoundException {		

		int choice;
		Test t1=new Test();
		
			System.out.println("\t Welcome User !\n1.Java test\n2.Unix test\n3.Exit\n Enter choice :");
			choice=scanner.nextInt();
			
				switch(choice){
				case 1:t1.javaTest();
					break;
	//			case 2:t1.unixTest();
	//				break;
				case 3:System.exit(0);	
				default:System.out.println("Wrong choice");	
				}		
	}
}