
public class Box {
	private double width; 
	private double height;
	private double depth;
	
	Box(double width, double height, double depth) {
		this.width= width;// this odredjuje na koje se parametre odnosi unutar metode
		this.height=height;
		this.depth=depth;
	}
	double volume() {
		return width*height*depth;
	}
	}

