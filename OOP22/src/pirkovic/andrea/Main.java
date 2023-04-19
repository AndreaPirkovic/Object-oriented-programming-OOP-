package pirkovic.andrea;

public class Main {

	public static void main(String[] args) {
		
		Circle c1 = new Circle (10);//konstruktor sa parametrom**
		Circle c2 = new Circle(c1);// c1 objekat koji je vec kreiran u prethodnom koraku ***
	System.out.println("Povrsina kruja:" + c2.area());
	}

}

