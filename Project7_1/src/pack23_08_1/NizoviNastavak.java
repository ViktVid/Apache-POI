package pack23_08_1;

public class NizoviNastavak {

	public static void main(String[] args) {
		
		double a = 10;
		double b = 20;
		
		double result;
		
		result = sabiranje(a, b);
		System.out.println("Sabiranje: " + result);
		
//		result= oduzimanje(a, b);
//		System.out.println("Oduzimanje: " + result);
//		result= deljenje(a, b);
//		System.out.println("Deljenje: " + result);
//		result= mnozenje(a, b);
//		System.out.println("Mnozenje: " + result);

	}

	public static double sabiranje (double x1, double x2) {
		return x1 + x2;
	}
}
