package pirkovic.andrea;

public class ObjekatKlasePrimer {

	public static void main(String[] args) {
		//nazivKlase nazivObjekta= new nazivKlase();
		A objekat = new A(); // kreiranje novog objekta(instance) iz klase A.
		//Objekat predstavlja instancu odredjene klase, i kreiran je tokom izvrsavanja i 
		//sastavljen je od odredjenog broja polja tj podataka
		// Metode klase se pozivaju pomocu operatora.() Tacka je operator pristupa
		//nazivObjekta.nazivMetode();
		objekat.PrikaziPoruku();// za objekat se poziva metoda pod nazivom Prikazi Poruku
	}

}
