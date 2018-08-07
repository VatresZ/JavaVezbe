import java.util.Scanner;
public class ProizvodSaNizom {
	static Scanner sc = new Scanner(System.in);
//3. Unesite dva broja (npr. a i b). 
//   Neka program ispiše proizvod svih brojeva izmeðu a i b (raèunajuæi tu i same a i b). 
//	 Npr. ako je a=3 i b=5, neka se ispiše 60.
//	4. Promenite program tako da raèunanje proizvoda iz 3. zadatka izdvojite u poseban metod, koji se onda poziva iz _main_.
//	//////////////////////////////////////OVO JE ZADATAK//////////////////////////
//	6. (bonus zadatak!) Napravite metod koji vraæa _niz_ svih brojeva izmeðu a i b (raèunajuæi i same a i b). 
//	Napravite metod koji vraæa proizvod svih brojeva u nekom nizu. 
//	Kombinujuæi ta dva metoda, ponovo izraèunajte i ispišite vrednost koja se tražila u 3. zadatku. 
//	Da li se dobija isti rezultat?
	public static int[] vratiNiz (int a, int b) {		
		int velicina = 0;
	
		if (a<=b) {			
			velicina = b - a + 1;
			int[] niz = new int[velicina];
			int index = 0;
			
			for (int i = a; i <= b; i++) {
				niz[index] = i;
				index++;		
			}			
			return niz;			
		} else {
			
			velicina = a - b + 1;
			int[] niz = new int[velicina];
			int index = 0;
			
			for (int i = a; i >= b; i--) {
				niz[index] = i;
				index++;
						
			}
			return niz;	
		}			
	}
		
	public static int vratiProizvod (int[] niz) {
		
		int rezultat = 1;

		for (int i = 0; i < niz.length; i++) {
			rezultat *= niz[i];
		}	
		return rezultat;		
	}
	
	public static void main (String args[]) {	
		System.out.println("Unesite dva cela broja: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
 
		int[] niz = vratiNiz (a,b);
		int rezultat = vratiProizvod (niz);
			
		System.out.print("Proizvod intervala izmedju unetih brojeva je: " + rezultat);
  }
}