package Practice;

public class Practice11 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("入力された数値を合計します。1から9の数値を入力して下さい。0を入力したら計算結果を表示します。");
			int num = 0;
			int sum = 0;
			int i = 0;

			while(i < 1){
				num = scanner.nextInt();
				if(num == 0) {
					break;
				}
				if(num < 0 || num > 9){
					System.out.println("0から9の数値を入力して下さい。");
					continue;
				}
				sum += num;
			}
			System.out.println("合計値は" + sum + "です。");
	}
}
