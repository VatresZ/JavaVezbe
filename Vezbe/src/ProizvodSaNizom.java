import java.util.Scanner;
public class ProizvodSaNizom {
	static Scanner sc = new Scanner(System.in);
//3. Unesite dva broja (npr. a i b). 
//   Neka program ispi�e proizvod svih brojeva izme�u a i b (ra�unaju�i tu i same a i b). 
//	 Npr. ako je a=3 i b=5, neka se ispi�e 60.
//	4. Promenite program tako da ra�unanje proizvoda iz 3. zadatka izdvojite u poseban metod, koji se onda poziva iz _main_.
//	//////////////////////////////////////OVO JE ZADATAK//////////////////////////
//	6. (bonus zadatak!) Napravite metod koji vra�a _niz_ svih brojeva izme�u a i b (ra�unaju�i i same a i b). 
//	Napravite metod koji vra�a proizvod svih brojeva u nekom nizu. 
//	Kombinuju�i ta dva metoda, ponovo izra�unajte i ispi�ite vrednost koja se tra�ila u 3. zadatku. 
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