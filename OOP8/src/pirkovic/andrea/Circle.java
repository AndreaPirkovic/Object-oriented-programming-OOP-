package pirkovic.andrea;

public class Circle {
	
	private double radius; // jedan podatak tj atribut double tipa
	
	Circle ()
	{
		radius=0.0;
		
	}
	
	Circle(double radius)
	{
		this.radius= radius;
	}
	public double area() // metoda area koja nema parametar () prazna zagrada
	{
		return 3.14*radius*radius;
		
	}
	

}
