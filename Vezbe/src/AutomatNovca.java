
public class AutomatNovca {

	//Napraviti klasu za proveru automata novca.Stanje novca u automatu je 4000.00 dinara.
	//Potrebno je uloziti 1000.00 dinara  i ispisati stanje pre i posle ulaganja. 
	//Zatim je potrebno podici 500.00 dinara i ispisati stanje automata pre i posle 
	//podizanja novca. 
	
	double stanje = 4000.00;
	void podigniIznos (double iznos) {
		stanje = stanje - iznos;
	}
	void uloziIznos (double iznos) {
		stanje = stanje + iznos;
	}	
		double vratiStanje() {
			return stanje;
		}	
	void ispisiStanje () {
		System.out.println("Trenutno stanje novca u automatu je: " + stanje + " dinara");
	
	}
	public static void main(String[] args) {
		AutomatNovca atm= new AutomatNovca();
			
			atm.ispisiStanje();
			atm.uloziIznos(1000.00);
			atm.ispisiStanje();
			
			atm.ispisiStanje();
			atm.podigniIznos(500.00);
			atm.ispisiStanje();

}
	}
		