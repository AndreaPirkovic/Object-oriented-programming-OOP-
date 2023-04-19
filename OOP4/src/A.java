
public class A {

	private String message;// 'String' je tip podataka promenljive 'message'
	// klasu A opisuje podatak message
	public void setMessage(String msg) {
		// setMessage postavlja vredbost, ne vraca je zato je tipa void
		message=msg;
	}
	
	public String getMessage() //vraca odgovarajuci tip podataka, neku vrednosti
	{
		return message;// message je ovde atribut
	}
	
	
	}
	// Parametri i argumenti metode

//Promenljiva msg deklarisana u zaglavlju metode (String msg) nazivamo parametrom
//Argument se prosledjuje metodi prilikom poziva metode
//Prilikom poziva parametri dobijaju vrednost argumenta metode
