package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

import java.util.Scanner;

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car[] cars = new Car[3];
		for(int i = 0; i < cars.length; i++){
			System.out.println(i + 1 + "台目の情報を入力します");		/* ##には、カウントを入れてください */
			System.out.println("シリアルナンバー、色、ガソリンの量をカンマ区切りで入力してください");
			String line = scanner.nextLine();
			String[] data = line.split(",", -1);
			cars[i] = new Car();
			cars[i].serialNo =Integer.parseInt(data[0]);
			cars[i].color =data[1];
			cars[i].gasoline =Integer.parseInt(data[2]);
		}

		final int distance = 300;



		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i].serialNo);
			System.out.println(cars[i].color);
			System.out.println(cars[i].gasoline);
		}


		for(int i = 0; i < cars.length; i++) {
			int result = 0;
			int here = 0;
			int time = 0;
			while(true) {
				result = cars[i].run();

				if(result == -1){
					System.out.println(i + 1 + "台目は目的地に到達できませんでした");
					break;
				}else if(distance < here){
					System.out.println(i + 1 + "台目は目的地にまで" + time +"時間かかりました。残りのガソリンは、" + (cars[i].gasoline + 1) + "リットルです");
					break;
				}else {
				here += result;
				time++;
				}
			}
		}
	}
}
