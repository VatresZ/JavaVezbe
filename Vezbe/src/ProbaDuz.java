import java.util.Scanner;
//9. Neka program napravi ta�ku u ravni s koordinatama (a, b) (dakle, x=a i y=b), i ispi�e koliko je ona udaljena od ta�ke (0, 0).
//

class ProbaDuz{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Unesite koordinate pocetne tacke :" );
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Tacka t1 = new Tacka(a, b);
		Tacka t2 = new Tacka(0, 0);
		
		Duz d = new Duz(t1, t2);
		
		System.out.println("Udaljenost tacke od koordinatnog pocetka je  " + d.vratiDuz());
	}
		
}