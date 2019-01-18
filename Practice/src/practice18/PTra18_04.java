/*
 * PTra18_04.java
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

public class PTra18_04 {

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




		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

	        ArrayList<Player> gk = new ArrayList<>();
	        ArrayList<Player> df = new ArrayList<>();
	        ArrayList<Player> mf = new ArrayList<>();
	        ArrayList<Player> fw = new ArrayList<>();
			for(Player i:array) {
				Player player = new Player();
				String temp = i.getPosition();


					if((temp.equals("GK"))){
						player.setPosition(i.getPosition());
		                player.setName(i.getName());
						player.setCountry(i.getCountry());
						player.setTeam(i.getTeam());
						gk.add(player);

					}else if(temp.equals("DF")){
						player.setPosition(i.getPosition());
		                player.setName(i.getName());
						player.setCountry(i.getCountry());
						player.setTeam(i.getTeam());
						df.add(player);
					}else if(temp.equals("MF")){
						player.setPosition(i.getPosition());
		                player.setName(i.getName());
						player.setCountry(i.getCountry());
						player.setTeam(i.getTeam());
						mf.add(player);
					}else{
						player.setPosition(i.getPosition());
		                player.setName(i.getName());
						player.setCountry(i.getCountry());
						player.setTeam(i.getTeam());
						fw.add(player);
					}
				}

				for(Player i:array2) {
						System.out.println(i.toString());
				}

			}

	}
}
