package practice05;
/*
 * PTra05_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra05_04 {
	public static void main(String[] args) {
		// 入力型プログラムです。
		// 下記の命令は、入力型プログラムで必要な記述になります。
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		/*
		 * 以下のプログラムは未完成です。
		 * ★ 下記の仕様に合わせて、プログラムを修正してください
		 *
		 * ●2～6まで、それぞれ火曜～土曜を出力するようにしてください
		 * ●0～6以外が入力された場合は①に戻るようにしてください
		 * ●0～6が入力されている場合は、各曜日を出力した後プログラムを終了します
		 *
		 */

		// ①
		System.out.println("0～6の整数を入力してください");


		int i =0;
		while( i <1){
			String line = scanner.nextLine();
			switch(line) {
				case "0":
					System.out.println("日曜");
					i++;
					break;
				case "1":
					System.out.println("月曜");
					i++;
					break;
				case "2":
					System.out.println("火曜");
					i++;
					break;
				case "3":
					System.out.println("水曜");
					i++;
					break;
				case "4":
					System.out.println("木曜");
					i++;
					break;
				case "5":
					System.out.println("金曜");
					i++;
					break;
				case "6":
					System.out.println("土曜");
					i++;
					break;
				default:
					System.out.println("0～6の整数を入力してください");
					continue;
			}
		}
	}
}
