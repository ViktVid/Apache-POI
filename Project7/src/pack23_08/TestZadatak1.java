package pack23_08;

import java.util.Scanner;

public class TestZadatak1 {

	public static void main(String[] args) {
		
		/*ZADATAK 1
     Napisati program koji racuna prosecnu visinu kosarkaskog tima.
     Korisnik na standardni ulaz unosi visinu svih pet igraca kosarkskog tima.
     Visina je izrazena u metrima.
     Po zavrsetku unosa ispisuje se prosecna visina clana ekipe, visina
     najviseg igraca, visina najnizeg igraca. */
		
		Scanner prosecnaVisina = new Scanner(System.in);
		
		for ( double x= 0; x < 5; x++) {
			System.out.println("Unesite visinu svih 5 igraca u metrima: ");
			double visina = prosecnaVisina.nextDouble();
		}
		
		
		
		

		

	}

}
