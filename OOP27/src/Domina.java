
public class Domina {
	private double a, b;
	
	
	Domina (double a, double b){
		this.a = a;
		this.b = b;
		
	}
		
	public double  getprvoPolje() {
		return a;
	}
	public double  getdrugoPolje() {
		return b;
	}
	public Domina okreni() {
		double pomocna = a; 
		a = b; 
		b = pomocna; 
		return this;// vraca trenutno stanje!!!
		}
	public boolean ispitajJednakost(Domina d) {
				  
				return a==d.a && b==d.b || b==d.a && a == d.b;
	}
	public String tekstualniOpis() {
		return "(" + a + ", " + b + ")";
	}
	}



