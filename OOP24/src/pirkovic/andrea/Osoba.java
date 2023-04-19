package pirkovic.andrea;

public class Osoba {

	public String ime, datumRodjenja, adresaStanovanja;
	//konstruktor
	// ukoliko ne navedemo konstruktor pozvace se "default" konstruktor
	public String ispisi() {
		return "Ime:" + ime + "\n" + "Datum rodjenja" + datumRodjenja + "\n" + "Adresa" + adresaStanovanja + "\n";   
	}
}
