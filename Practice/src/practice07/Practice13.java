package practice07;

public class Practice13 {
	public static void main(String[] args) {
		int[][] score = {
			{95,88,87},
			{70,81,100},
			{12,98,90},
			//{100,100,100},
		};
		for(int[] value:score) {
			int sum = 0;
			for(int array:value) {
				sum += array;
			}
			System.out.println(sum);
		}
	}
}
