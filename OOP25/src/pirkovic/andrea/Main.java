package pirkovic.andrea;

public class Main {

	public static void main(String[] args) {
		
		Valjak v1 = new Valjak();
		Valjak v2= new Valjak (3,5);
		System.out.println("V1:" + v1 + "" + v1.V());
		System.out.println("V2:" + v2 + "" + v2.V());
	}

}
