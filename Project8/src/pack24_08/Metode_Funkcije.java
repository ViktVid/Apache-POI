package pack24_08;

public class Metode_Funkcije {

	public static void main(String[] args) {	
/*
	Metode su lokacijski nezavisne *
  
1.  Konkatenacija stringova (lepljenje (spajanje) stringova)!
 
 
 */
		
		String ime1 = "Marko";
		String prezime1 = "Markovic";
		String naziv1 = getNameAndSurname(ime1, prezime1);
		System.out.println(naziv1);

	}
/**
 * getNameAndSurname
 * ova f-ja vraca ispisano ime i prezime
 * 
 * @param name - ime korisnika
 * @param surname - prezime korisnika
 * @return - ispis
 */
	public static String getNameAndSurname(String name, String surname) {
		String msg = "Vase ime i prezime je: " + name + " " + surname;
		return msg;
	}
	
	
	
}
