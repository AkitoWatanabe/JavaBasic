package practice16;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 */
public class PTra16_01 {
    public static void main(String[] args) {
    	Date date = new Date();
    	SimpleDateFormat f = new SimpleDateFormat("YYYY年MM月DD日");
    	String str =f.format(date);
    	System.out.println(str);
        /*
        * ★ 現在時刻を「YYYY年MM月DD日」形式で出力してください
        */
    }
}