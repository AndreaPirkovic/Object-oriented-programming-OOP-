
public class Main {

	public static void  test () // staticka metoda test
	{
		
		
			int a=10;
			System.out.println("BBB");
			
			if(a==10)
			{
				System.exit(0);// prekid izvrsenja programa, anuliranje procesa
			}//Nula je povratna vrednost koja ukazuje da je program uspesno izvrsen bez gresaka
			System.out.println("CCC");
			}
		
		public static void main(String[] args) {
			System.out.println("AAA");
			test();// pozivanje metode test
			System.out.println("DDD");
			
		}
	}


