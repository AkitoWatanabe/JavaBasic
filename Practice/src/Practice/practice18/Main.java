package Practice.practice18;

public class Main {
	public static void main(String[] args){
		Employee employee = new Employee();
		employee.setCompany("テストカンパニー");
		employee.setName("山田太郎");
		employee.setAge(20);

		System.out.println(employee.getCompany());
		System.out.println(employee.getName());
		System.out.println(employee.getAge());
	}
}
