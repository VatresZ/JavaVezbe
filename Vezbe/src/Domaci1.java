import java.util.Scanner;

public class Domaci1 {
	static Scanner sc = new Scanner(System.in);
//1. Napravite klasu _Domaci1_ i u njoj metod _main_ koji �e �initi glavni program. 
//   Neka program tra�i od korisnika da unese tri cela broja (a, b, c). Proverite da program mo�e da se pokrene.
//2. Neka program ispi�e vrednost najmanjeg broja. Npr. ako je uneto 3, 2, 5, neka ispi�e da je najmanja vrednost 2.
	   
  public static void main (String args[]) {
	System.out.println("Unesite tri cela broja: ");
	  int minBroj = Integer.MAX_VALUE;
	  int i = 0;
	  while (i<3) {
		  int x = sc.nextInt();
		 if (x<minBroj) {
			minBroj = x;
		}
		  i++;
	  }
	  System.out.println("Najmanji uneti broj je " + minBroj);

  }
}