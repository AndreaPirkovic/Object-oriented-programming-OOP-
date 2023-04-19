package pirkovic.andrea;

public class DemoKlasa {

	public static void main(String[] args) {
		
		A.prikaziPoruku();
		// naziv klase.naziv metode
		// bez kreiranja objekta smo pozvali metodu jer je static!!!
		// static omogucava poziv metode preko klase
		A a = new A(); // moze da se kreira i objekat 'a' klase 'A' pa da se pozove metoda iz te klase A
		a.prikaziPoruku();// u ovom slucaju metoda je 'prikaziPoruku'
	}

}
