package pirkovic.andrea;

public class Tacka {
	private double x;
	private double y;
	Tacka(double x,	double y) {
		this.x =x;
		this.y=y;
		}
	public Double getX() {
		return  x;
			}
	
	public Double getY() {
		return  x;
	}
	public String ispisi() { 
		return"(" + x + " , " + y + ")";// konvertovanje u string, navodnici ispred zagrade!!! 
		}
}