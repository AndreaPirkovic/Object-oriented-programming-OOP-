package pirkovic.andrea;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Tacka t1 = new Tacka(2,5);
		Tacka t2 = new Tacka(3,6);
		
		System.out.println(" Prva Koordinata tacke 1 je: " + t1.getX());
		System.out.println(" Druga Koordinata tacke 1 je: " + t1.getY());
		System.out.println(t1.ispisi());
			
		
	}

}
