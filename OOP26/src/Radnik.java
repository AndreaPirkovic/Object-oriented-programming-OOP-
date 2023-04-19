
public class Radnik {
	

		private double prihod, procenat;
		private String ime;
		
		Radnik (double prihod, double procenat, String ime){
			this.prihod = prihod;
			this.procenat = procenat;
			this.ime = ime;
		}
		public double  prihod() {
			return prihod;
		}
		public double  plata() {
			return prihod()*procenat/100;
		}
		public String  ispis() {
			return ime + "/" + plata();
		}
		public void drugiOpis() {
			System.out.println(ime + "/" + plata());
		}
		}

