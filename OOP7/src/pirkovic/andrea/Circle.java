package pirkovic.andrea;

public class Circle {

	// This * * Kljucna rec this ili referenca this 
	//pruza nacin da metoda zna koji 
	//tacno objekat je pozvao metodu, 
	//tj sa cijim podacima radi. * 
	//Takodje, moze se koristiti za pristup podacima 
	//objekta koji su sakriveni lokalnim promenljivama 
	//ili parametrima metode. * * 
	//Takodje, odnosi se na trenutni objekat u metodi ili konstruktoru.
	
	private double poluprecnik;// promenljiva tipa double
	Circle()
	{
		poluprecnik=0.0;
	}
	Circle(double radius)
	{
		this.poluprecnik = radius;
		// this pruza nacin da metoda poluprecnik zna koji tacno objekat poziva metodu
	}
	public double area() {
	
		return 3.14*poluprecnik*poluprecnik;
	}
}
