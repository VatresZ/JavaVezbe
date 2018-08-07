import java.util.Scanner;

public class PoredjenjeBrojeva1 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		System.out.print("Unesi dva broja");
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x == y) {
			 System.out.print("Brojevi su isti");
		}
		System.out.print("Brojevi su razliciti");
	}
}
