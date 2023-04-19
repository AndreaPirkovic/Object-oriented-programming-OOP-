package pirkovic.andrea;

public class Circle {

	private double radius;// atribut radius u okviru klase Circle
	
	Circle (double rad)// u okviru konstruktora mu se dodaje parametar rad
	// kome ovde nije unapred zadata vrednost vec se ta vrednost zadaje u trenutku kreiranja objekta
	{
		radius= rad;
		
	}
	
	public double area()
	{
		return 3.14*radius*radius;
}
}
