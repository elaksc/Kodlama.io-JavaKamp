public class ArkadasSayilar {
    public static void main(String[] args) {
		
		int number = 220;
		int number2 = 284;
		int total = 0;
		int total2 = 0;
		
		for (int i = 1; i <number; i++) {
			if (number % i == 0) {
				total = total + i;
			}
		}
		for (int i = 1; i < number2; i++) {
			if (number2 % i == 0) {
				total2 = total2 + i;
			}
		}
		
		if (number == total2 && number2 == total1) {
			System.out.println("Sayilar arkadast,r.");
		}else {
			System.out.println("Sayilar arkadas degildir.");
		}

	}
}
