package pirkovic.andrea;

public class Main {

	public static void main(String[] args) {
Matrica niz = new Matrica(4,5);
				System.out.println("Matrica ima: " + niz.getVrsta() + "vrsta");
				System.out.println("Matrica ima: " + niz.getKolona() + "kolona");
		
				System.out.println(niz.postavi(1,2,3));
				System.out.println("Vrednost:" + niz.dohvati(1,2));
				System.out.println(niz.toString());
	}}


