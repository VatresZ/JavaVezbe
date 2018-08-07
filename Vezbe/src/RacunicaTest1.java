import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RacunicaTest1 {

	@Test
	void test_proizvodNiza() {
		
		int niz[] = new int[3];
		niz[0]=4;
		niz[1]=5;
		niz[2]=6;
		int rez= Racunica.proizvodNiza(niz);
		assertEquals(120, rez);
//		if (rez !=120) {
//		fail("Pogresan rezultat");
	}
	
	@Test
	void test_proizvodNiza_prazan() {
		int niz[] = new int[0];
		int rez= Racunica.proizvodNiza(niz);
//		if (rez !=1) 
		assertEquals(1, rez);	
	
	}
	
}

