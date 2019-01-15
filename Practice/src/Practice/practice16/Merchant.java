package Practice.practice16;

public class Merchant {
	int price = 100;
	int stock = 100;
	int money = 0;

	void sellitem(int num){
		this.stock -= num;
		this.money += this.price * num;
	}
	String confirmMoney(){
		return "売り上げは" + this.money + "円です。";
	}
}
