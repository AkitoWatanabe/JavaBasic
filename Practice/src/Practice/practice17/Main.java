package Practice.practice17;

public class Main {
	public static void main(String[] args) {
		Employee employee1 = new Employee();
		Employee employee2 = new Employee("太郎");
		Employee employee3 = new Employee("二郎",30);

		employee1.Getplofile();
		employee2.Getplofile();
		employee3.Getplofile();
	}
}
