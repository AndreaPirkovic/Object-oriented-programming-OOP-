package pirkovic.andrea;

public class Main {

	public static void main(String[] args) {
		// prosledjivanje objekta c1 metodi calcArea
		// klasa je novi slozeni tip podataka koji se sastoji od primitivnih tipova podataka
		Circle c1= new Circle(20);// kreiranje objekta sa zadatom vrednosti
		Circle c2= new Circle(20);
		calcArea(c1); // staticka metoda koja se poziva samo kao naziv metode i u zagradi objekat
		calcArea(c2);
	}
	// c1 vs c
	//c1 je objekat klase za koji se poziva metoda calcArea
	// asd je parametar klase unutar metode calcArea
	public static void calcArea(Circle asd) { // povrsina objekta klase Circle se racuna preko metode .area()
		System.out.println("Povrsina kruga je " + asd.area());
	//ovde smo napravili opsti kod koji moze da se poziva i za druge objekte 
		//koji pozivaju istu metodu za calcArea
	}

}
