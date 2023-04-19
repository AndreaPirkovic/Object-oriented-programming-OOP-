package pirkovic.andrea;

public class Circle {
	
	private double poluprecnik; //jedan atribut 

	Circle() // konstruktor ima isto ime kao klasa
	//i prazan je () bez parametara
	{
		poluprecnik=10.0;
		// promenljiva poluprecnik ima vrednost 10 koja je postavljena 
		// u konstruktoru prilikom kreiranja objekta
	}
	public double area()
	{
		return 3.14*poluprecnik*poluprecnik;
	}
	}


