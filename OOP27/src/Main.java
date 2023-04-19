
public class Main {

	public static void main(String[] args) {
		
		Domina d1= new Domina(3,5);
		Domina d2= new Domina (2, 6);
		
		System.out.println(d1.ispitajJednakost(d2));
		//System.out.println(d1.okreni());
		System.out.println(d1.tekstualniOpis());
		System.out.println(d2.tekstualniOpis());
		
		d1.okreni();
		System.out.println(d1.tekstualniOpis());
	}

}
