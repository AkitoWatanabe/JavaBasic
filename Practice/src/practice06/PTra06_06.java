package practice06;
/*
 * PTra06_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_06 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 */
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j + i < 5; j++) {
				System.out.print("■");
			}
			for(int k = 0; k - i < 0; k++) {
				System.out.print("□");
			}
			System.out.print("\n");
		}
	}
}
