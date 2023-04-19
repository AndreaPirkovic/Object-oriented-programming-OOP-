package pirkovic.andrea;

public class Valjak {

	private double poluprecnik, visina;
	
	Valjak (double r, double h){
		poluprecnik = r;
		visina = h;
		
	}
	Valjak (){
		poluprecnik=1;
		visina=1;
	}
	
	
	public double  getR() {
		return poluprecnik;
	}
	public double  getH() {
		return visina;
	}

	public double V() {
	return poluprecnik*poluprecnik*3.14*visina;
}
	public void opis() {
		System.out.println ("[" + poluprecnik + "," + visina + "]");   
	}
}