package pack24_08;

import java.util.Scanner;

public class Vezbanje {

	public static void main(String[] args) {

		System.out.println(
				"Unesite jednu od opcija: \n 0 - Izlaz. \n 1 - Unesite cenu proizvoda. \n 2 - Unesite kolicinu novca za isplatu. ");
		/*
		 * Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za
		 * potrosace sadrzi sledece opcije: 0 - Izlaz iz programa (zatvaranje kase) 1 -
		 * dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu) 2 - naplata
		 * racuna Ukoliko korisnik unese opciju 0 program se zavrsava. Ukoliko korisnik
		 * unese opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se
		 * dodaje na racun u prodavnici. Ukoliko korisnik unese opciju 2 program pita
		 * korisnika da unese kolicinu novca za naplatu racuna. Ukoliko korisnik unese
		 * vrednost manju od vrednosti racuna, potrebno je da se ispise greska, bez
		 * umanjenja racuna i da se ponovo ispise meni. Ukoliko korisnik unese vrednost
		 * vecu ili jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja
		 * na nulu. Zatim se ponovo ispisuje meni.
		 */
		Scanner meni = new Scanner(System.in);

		int izbor = meni.nextInt();
		String s = meni.next();
		double unosCene;
		double unosNovca = meni.nextDouble();

		while (izbor == 0) {

			izbor = meni.nextInt();

			unosCene = meni.nextDouble();
			System.out.println("Cena proizvoda je: " + unosCene);
			unosCene = unosCene + 0;
			System.out.println("Ukupan iznos je: " + unosCene);

			if (izbor == 1) {
				System.out.println("Unesite cenu proizvoda.");
			} else if (izbor == 2) {
				System.out.println("Unesite kolicinu novca za isplatu: " + unosNovca);
				unosNovca = meni.nextDouble();
				if (unosNovca == unosCene) {
					System.out.println("Vas racun u iznosu od " + unosCene + " je placen.");
				} else if (unosNovca > unosCene);
				System.out.println("Vas kusur je: " + (unosNovca - unosCene));
			}
		}
		System.out.println("Placanje je izvrseno.");

	}

}
