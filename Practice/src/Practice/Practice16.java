package Practice;

import Practice.logic.PracticeLogic16;

public class Practice16 {
	public static void main (String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("年齢を入力して下さい。");
		int age = scanner.nextInt();

		boolean result = PracticeLogic16.checkChild(age);
		if(result == true) {
			System.out.println("子供");
		}else if(result == false) {
			System.out.println("大人");
		}
	}
}
