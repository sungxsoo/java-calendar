package calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		//출력 : 화면에 두 수의 합을 출력한다.
		int a, b;

		
		//입력 : 키보로 두 수의 입력을 받는다.
		String s1, s2;
		
		Scanner sc = new Scanner(System.in);
		
		s1 = sc.next();
		s2 = sc.next();
		
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		

		System.out.printf("두 수의 합은 %d 입니다.",(a+b));
		
		sc.close();		
	}
}
