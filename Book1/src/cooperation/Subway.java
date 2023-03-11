package cooperation;

public class Subway {
	String linenumber;
	int passengerCount;
	int money;
	
	public Subway(String lineNumber) {
		this.linenumber = linenumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(linenumber + "의 승객은" + passengerCount+"명이고, 수입은" + money+ "입니다.");
	}

}
