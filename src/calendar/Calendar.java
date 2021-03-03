package calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31,30,31};
	public int getmaxDaysofMonth(int month) {
		return MAX_DAYS[month-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		
		Calendar cal = new Calendar();
		
		System.out.println("달을 입력하세요.");
		
		int month = sc.nextInt();
		
		System.out.printf("%d월은 %d일 까지 있습니다\n", month, cal.getmaxDaysofMonth(month));

		sc.close();
	}

}
