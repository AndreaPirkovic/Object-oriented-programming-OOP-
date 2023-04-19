package pirkovic.andrea;

public class DemoKlasa {

	public static void main(String[] args) {
		
		Rastojanje r1 = new Rastojanje (); //kreiranje objekta klase Rastojanje
		Rastojanje r2 = new Rastojanje ();
		Rastojanje r3 = new Rastojanje ();
		r1.stopala=14;// operator dodele vrednosti dodeljuje objektu r1 podatke 'stopala' i njihovu vrednost
		r1.inci=9.5;// dodela vrednosti 9.5 objektu r1 sa podatkom 'inci'
		
		r2.stopala=19; // r1 i r2 su instance tj objekti klase Rastojanje
		r2.inci=5.5;
		
		System.out.println("Rastojanje 1 :" + r1.stopala + "\'-" + r1.inci + "\"");
		System.out.println("Rastojanje 1 :" + r2.stopala + "\'-" + r2.inci + "\"");
	
		System.out.println("Rastojanje 1 :" + r3.stopala + "\'-" + r3.inci + "\"");
		// ako se ne navede vrednost podataka tj atributa objekta, dodaje se pocetna tj default vrednost koja je za i int i double tip podataka po defaultu nula
		
	}

}
