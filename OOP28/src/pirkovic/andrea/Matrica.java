package pirkovic.andrea;

public class Matrica {
	
		private double [][]matr;
		
		
		public Matrica (int vrsta, int kolona){
			matr = new double [vrsta][kolona];
			
		}
			
		public double  getVrsta() {
			return matr.length;// length je duzina date vrste tj duzina elemenata 
		}
		public double  getKolona() {
			return matr[0].length;
		}
		
		public  Matrica postavi(int v, int k, double vr) {
			matr[v][k]= vr;
			return this;
		}
		public double dohvati(int v, int k) {
			return matr[v][k];
			
		}
		public String toString() {
			String s="";
			for (int v=0;v<matr.length;v++) {
				for (int k=0;k<matr.length;k++) {
					{
						System.out.println(matr[v][k] + "\n");
						s = s+'\n';
					}
					}
			}
			return s;
		}
		}





