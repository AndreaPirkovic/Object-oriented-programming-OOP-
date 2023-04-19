
public class Box {
	private double width; 
	private double height;
	private double depth;
	
	Box() {// konstruktor bez parametara inicijalizovan na jedinicu
		width= 1;
		height=1;
		depth=1;
	}
	Box(double w, double h, double d) {
		width= w;// konstruktor sa 3 parametra, sa dodeljenim vrednostima
		height=h;
		depth=d;
}
	Box(double len){// konstruktor sa jednim parametrom, gde je jedna vrednost promenljive dodeljena svim atributima
		width= height = depth= len;
	}
	Box(Box b){// konstruktor sa slozenim tipom podataka, koji poziva b2 objekat, prosledjivanje objekta konstruktoru
		width= b.width;
		height=b.height;
		depth=b.depth;
	}
		double volume() {
			return width*height*depth;	
	}
	}
