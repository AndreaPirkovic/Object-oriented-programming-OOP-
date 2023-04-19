

public class Main {

	public static void main(String[] args) {
		
						
				Radnik r1 = new Radnik(150000, 100, "Zika");
				Radnik r2= new Radnik (120000, 80, "Mika");
				System.out.println( "Prihod prvog radnika" + r1.prihod());
				System.out.println("Plata drugog radnika "+ r2.plata());
				System.out.println("Ime/plata prvog radnika" + r1.ispis());
				//System.out.println(r2.drugiOpis());
	}
	}


