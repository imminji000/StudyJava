package loopexample;

public class DowhileExample {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
			
		}while(num <= 10);
	
		System.out.println("1부터10까지의 합은" +sum+ "입니");
	}
}
