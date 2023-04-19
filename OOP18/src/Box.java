
public class Box {
	

		private double width; // ovo polje vidi samo ova klasa, ne vidi se u main klasi
		private double height;
		private double depth;
		
		Box(double w, double h, double d) {// prosledjivanje vrednosti konstruktoru
			// pri kreiranju objekta-parametarski konstruktor
			width= w;// konstruktor je javan i preko njega se pristupa onim atributima
			height=h;
			depth=d;
		}
		double volume() {
			return width*height*depth;
		}
		}

