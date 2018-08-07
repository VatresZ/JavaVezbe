
public class RacunicaTest {
//	Unit test
 static boolean testPoizvodNiza(){
	int niz[] = new int[3];
	niz[0]=4;
	niz[1]=5;
	niz[2]=6;
	int rez= Racunica.proizvodNiza(niz);
	if (rez !=120) {
		System.out.println("Rezultat " + rez + "umesto 120");
	} 	
	return rez == 120;
 }
	static boolean testPoizvodNiza_prazan( ) {
		int niz[] = new int[0];
		int rez= Racunica.proizvodNiza(niz);
		if (rez !=1) {
			System.out.println("Rezultat " + rez + "umesto 1");		
	}
		return rez == 1;
}
	
//	Integracioni testovi:
		static boolean testProizvodOdDo() {
		int rez = Racunica.prizvodOdDo(3,5);
		if (rez != 60) {		
			System.out.println("Rezultat " + rez + " umesto 60");
		}	
			return rez == 60;			
		}
		
 public static void main(String[] args) {
//		if (!testPoizvodNiza()) {
			System.out.println("tetsProizvodNiza " + testPoizvodNiza());
			System.out.println("tetsProizvodNiza_prazan " + testPoizvodNiza_prazan());
			System.out.println("tetsProizvodOdDo " + testProizvodOdDo());
//		}
		
	}
}
