package Practice.practice21;

public class Sample {
	static int numCheck(int num){
			if(num < 0){
				throw new RuntimeException();
			}
			return num;
	}
	public static void main(String[] args) {
		try {
			System.out.println(numCheck(10));
			System.out.println(numCheck(-2));
		}catch(RuntimeException e){
			System.out.println("RuntimeExceptionが発生しました");
		}
	}
}
