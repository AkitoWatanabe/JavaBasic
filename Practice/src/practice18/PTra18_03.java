/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
        ArrayList<Player> array = new ArrayList<>();

        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
            	Player player = new Player();
                String line = scanner.nextLine();
                // ★ 1行ごとにArrayListに格納してください
    			String[] temp = line.split(",");
                player.setPosition(temp[0]);
                player.setName(temp[1]);
				player.setCountry(temp[2]);
				player.setTeam(temp[3]);
				array.add(player);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }


		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
        String real = "レアル・マドリード";
        String barcelona = "バルセロナ";
        ArrayList<Player> array2 = new ArrayList<>();

		for(Player i:array) {
			Player player = new Player();
			String temp = i.getTeam();
			if((real.equals(temp)) || (barcelona.equals(temp))){

			}else {
				player.setPosition(i.getPosition());
                player.setName(i.getName());
				player.setCountry(i.getCountry());
				player.setTeam(i.getTeam());
				array2.add(player);
			}
		}

		for(Player i:array2) {
				System.out.println(i.toString());
		}





		// ★ 削除後のArrayListの中身を全件出力してください


	}
}
