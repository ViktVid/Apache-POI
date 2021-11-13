package pack23_08_1;

public class Metode_i_Funkcije {

	public static void main(String[] args) {

		int b = dajInteger();
		System.out.println("b: " + b);

		ispis();
		ispis();
		ispis();
		ispis();

		ispisPoruke("Poruka!");
		ispisPoruke("Poruka 1!");
		ispisPoruke("Poruka 2!");
		
		
		String one = "Pera";
		String two = "Lozac";
		spojeniStringovi (one, two);
	}

	private static int dajInteger() {
		int a = 2;
		System.out.println("a: " + a);
		return a;
	}

	private static void ispis() {
		System.out.println("Neki tekst.");
	}

	private static void ispisPoruke(String message) {

		System.out.println("Ovo je ispis drugog teksta: " + message);
	}

	private static void spojeniStringovi(String one, String two) {
		
		String message = one + " " + two;
		System.out.println("Ovo je ispis spojenih stringova: " + message);
	}
}
