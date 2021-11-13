package pack24_08;

public class Calculator {

	public static void main(String[] args) {

// Zadatak Kalkulator:
		
		double a = 1;
		double b = 2;

		System.out.println("Zbir broja a i b: " + saberi(a, b));
		System.out.println("Razlika broja a i b: " + oduzmi(a, b));
		System.out.println("Proizvod broja a i b: " + mnozi(a, b));
		System.out.println("Kolicnik broja a i b: " + deli(a, b));

		a = 10;
		b = 15;
		
		double c = saberi(a, b);
		System.out.println("C je: " + c);
		
		a = mnozi(a, b);
		b = deli(a, b);
		
		double d = saberi(a, b);
		System.out.println("D je: " + d);

	/*	while(true) {
			//meni: unesi a, b -> Izaberi operaciju
			switch(operacija) */
			
			
		
	}
	
	public static double saberi(double x1, double x2) {
		return x1 + x2;
		
	/*	Ili komplikovanije:
	 	int result;
		result = x1+ x2;
		return result; */
		
	}

	public static double oduzmi(double x1, double x2) {
		return x1 - x2;
	}

	public static double mnozi(double x1, double x2) {
		return x1 * x2;
	}

	public static double deli(double x1, double x2) {
		if (x2 == 00) {
			System.out.println("Ne mozemo deliti nulom.");
			return 0;
		}
		return x1 / x2;

	}

}
