package calendar;

import java.util.Scanner;

public class Prompt {

	private static final String PROMPT = "cal>";
	
	public void runPrompt() {

		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();  
		int month = 0;
		

		while(true) {
			System.out.println("달을 입력하세요.");
			
			System.out.print(PROMPT);
			
			month = sc.nextInt();
	
			if(month==-1||month>12) {
				break;
			}	
			
			cal.printCalendar(2017, month);
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		Prompt prompt = new Prompt();
		prompt.runPrompt();
	}
	
}
