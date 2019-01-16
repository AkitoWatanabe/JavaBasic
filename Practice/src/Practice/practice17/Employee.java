package Practice.practice17;

public class Employee {
	static String company = "テストカンパニー";
	String name;
	int age;

	Employee(){
		this.name = "名無し";
		this.age  = 20;
	}
	Employee(String name){
		this.name = name;
		this.age = 20;
	}
	Employee(String name, int age){
		this.name = name;
		this.age = age;
	}

	void Getplofile(){
		System.out.print("会社は" + company);
		System.out.print("、名前は" + name);
		System.out.println("、年齢は" + age);
	}
}
