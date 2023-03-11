package thisex;

class BirthDay {
	int day;
	int month;
	int year;
	
	public void setyear(int year) {
		this.year = year;
		
	}
	
	public void printThis() {
		System.out.println(this);
	}

}


	
public class ThisExample{
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setyear(2000);
		System.out.println(bDay);
		bDay.printThis();
	}
	
}
