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
import java.util.Random;
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

			int startingmenber;
			int random;
			int maxmenber;
			int[] temp = new int[4];
			Random rnd = new Random();

			maxmenber = 1;
			startingmenber = 0;
			temp[0] = 100;
			temp[1] = 100;
			temp[2] = 100;
			temp[3] = 100;
			while(true) {
				if(startingmenber  == maxmenber) {
					break;
				}
				random = rnd.nextInt(gk.size());
				//System.out.println(gk.size());
				//System.out.println(random);

				if(temp[startingmenber] != random) {
					System.out.println(gk.get(random));
					startingmenber ++;
				}
			}

			maxmenber = 4;
			startingmenber = 0;
			temp[0] = 100;
			temp[1] = 100;
			temp[2] = 100;
			temp[3] = 100;
			while(true) {
				if(startingmenber  == maxmenber) {
					break;
				}
				random = rnd.nextInt(df.size());
				//System.out.println(df.size());
				//System.out.println(random);

				if(temp[startingmenber] != random) {
					System.out.println(df.get(random));
					startingmenber ++;
				}
			}

			maxmenber = 4;
			startingmenber = 0;
			temp[0] = 100;
			temp[1] = 100;
			temp[2] = 100;
			temp[3] = 100;
			while(true) {
				if(startingmenber  == maxmenber) {
					break;
				}
				random = rnd.nextInt(mf.size());
				//System.out.println(mf.size());
				//System.out.println(random);

				if(temp[startingmenber] != random) {
					System.out.println(mf.get(random));
					startingmenber ++;
				}
			}

			maxmenber = 2;
			startingmenber = 0;
			temp[0] = 100;
			temp[1] = 100;
			temp[2] = 100;
			temp[3] = 100;
			while(true) {
				if(startingmenber  == maxmenber) {
					break;
				}
				random = rnd.nextInt(fw.size());
				//System.out.println(fw.size());
				//System.out.println(random);

				if(temp[startingmenber] != random) {
					System.out.println(fw.get(random));
					startingmenber ++;
				}
			}

	}
}
