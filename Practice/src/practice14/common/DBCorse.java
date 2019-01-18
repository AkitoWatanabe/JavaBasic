package practice14.common;

public class DBCorse implements Course{
	String corseName = "【Eラーニング】DB基礎";
	String[] courseUnit = {"DB基礎","SQL基礎","正規化","SQL応用"};
	/**
	 * コースの名称を取得します。
	 * 例）Java、DB基礎、IT基礎　など
	 * @return	単元の名称
	 */
	public String getCourseName() {
		return corseName;
	}

	/**
	 * コースの単元を取得します
	 * 例）プログラミングの書き方、式と演算子　など
	 * @return
	 */
	public String[] getCourseUnit() {
		return courseUnit;
	}

}
/*
 * ★ common.Courseを実装した、DBCourseクラスを作成してください
 *
 * コース名称
 * 		「【Eラーニング】DB基礎」
 * 単元
 * 		DB基礎
 * 		SQL基礎
 * 		正規化
 * 		SQL応用
 */