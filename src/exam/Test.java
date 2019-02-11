package exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
class Test {
	int marks=0;	
	String ans,ans1;
	String filePath="f:que.txt";
	File file=new File(filePath);
	
	
	//Function JavaTest
	public void javaTest() throws FileNotFoundException{
		
		Scanner scanner=new Scanner(file);
		Scanner scanner1=new Scanner(System.in);
		
		ArrayList<Question> questions= new ArrayList<Question>();
		
		while(scanner.hasNextLine()){			
			Question question=new Question();			
			String Line=scanner.nextLine();			
			
			String[] token = Line.split("\\|");
			
			question.setQuestionString(token[0]);
			question.setOpt1(token[1]);
			question.setOpt2(token[2]);
			question.setAns(token[3]);
			//questions arraylist
			questions.add(question);
			
	
			System.out.println(question.getQuestionString());	
			System.out.println(question.getOpt1());	
			System.out.println(question.getOpt2());	
				
			
			System.out.println("Enter correct option :");
			ans=scanner1.nextLine();
//			try {
//				ans=scanner1.nextLine();
//				if(ans!=question.getOpt1()||ans!=question.getOpt2())
//					System.out.println("Invalid option entered !!");
//					
//			}
//			catch(Exception e)
//			{				
//			}
			
						
			if(ans.equals(question.getAns())) {
				marks=marks+3;
				System.out.println("(+3) Correct option chosen !");
			}
			else
			{	marks=marks-3;
				System.out.println("(-3) Wrong answer chosen !");
			}
						
		}
		System.out.println("Total Marks gained:"+marks);
		scanner1.close();
		scanner.close();		
	}	

}
