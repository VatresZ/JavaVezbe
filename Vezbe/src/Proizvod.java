import java.util.Scanner;
public class Proizvod {
	static Scanner sc = new Scanner(System.in);
//3. Unesite dva broja (npr. a i b). 
//   Neka program ispi�e proizvod svih brojeva izme�u a i b (ra�unaju�i tu i same a i b). 
//	 Npr. ako je a=3 i b=5, neka se ispi�e 60.
	   
  public static void main (String args[]) {
	System.out.println("Unesite dva cela broja: ");
	
	int a = sc.nextInt();
	int b = sc.nextInt();
    int proizvod = 1;

	if (a<=b) {	
	 for (int i = a; i <= b; i++) {
		proizvod = proizvod * i;
	 }	
	}
	
	if(a>=b) {
		 for (int i = a; i >= b; i--) {
				proizvod = proizvod * i;
		 }		 
	}	
	  System.out.print("Proizvod intervala izmedju unetih brojeva je: " + proizvod);
  }
}