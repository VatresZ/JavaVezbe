import java.util.Scanner;
public class ProizvodSaMetodom {
	static Scanner sc = new Scanner(System.in);
//3. Unesite dva broja (npr. a i b). 
//   Neka program ispiše proizvod svih brojeva izmeðu a i b (raèunajuæi tu i same a i b). 
//	 Npr. ako je a=3 i b=5, neka se ispiše 60.
//	4. Promenite program tako da raèunanje proizvoda iz 3. zadatka izdvojite u poseban metod, koji se onda poziva iz _main_.
  
	public static int metodaProizvoda (int a, int b) {
		   int rezultat = 1;
		if (a<=b) {			
				 for (int i = a; i <= b; i++) {
					rezultat = rezultat * i;
				 }	
				}				
				if(a>=b) {
					 for (int i = a; i >= b; i--) {
							rezultat = rezultat * i;
					 }				 
				}
				return rezultat;	
	}		
	public static void main (String args[]) {	
		System.out.println("Unesite dva cela broja: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
 
		int proizvod = metodaProizvoda (a,b);
	
			System.out.print("Proizvod intervala izmedju unetih brojeva je: " + proizvod);
  }
}