import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Knjiga obj = new Knjiga();
		
		System.out.println("Unesite ime knjige: ");
		String nekaKnjiga= sc.nextLine();
		
		System.out.println("Unesite broj strana knjige: ");
		int brojStranica= sc.nextInt();
		
		System.out.println("Ime knjige je:" + obj.ime);
		System.out.println("broj strana je:" + obj.brojStranica);
	}

}
